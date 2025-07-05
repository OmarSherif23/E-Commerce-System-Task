import java.util.ArrayList;
import java.util.List;

public class CheckOut{
    public  static void processCheckout(Customer customer, Cart cart) throws Exception
    {
        if(cart.isEmpty()) {
            throw new Exception("Cart is empty");
        }
        double subtotal = 0;
        double shipping = 0;
        List<CartItem> shippingItems = new ArrayList<CartItem>();
        for (CartItem item : cart.getItems()) {
            Product product = item.product;
            if (item.quantity > product.quantity) {
                throw new Exception("Out Of Stock :" + product.name);
            }
            if (product.isExpired()) {
                throw new Exception("Product Expired: " + product.name);
            }
            double itemTotal = item.quantity * product.price;
            subtotal += itemTotal;
            if (product.shippingFees()) {
                shippingItems.add(item);
                shipping = (shipping+10)*item.quantity;
            }
        }
        double total = subtotal + shipping;

        if(!customer.pay(total)){
            throw new Exception("Insufficient Balance");
        }
        ShippingService.ship(shippingItems);

        System.out.println("\n** Checkout receipt **");
        for (CartItem item : cart.getItems())
        {
            System.out.println(item.quantity + "X " + item.product.name + "\t\t" + item.product.price*item.quantity);
        }


        System.out.println("---------------------------");
        System.out.println("Subtotal \t\t " + subtotal);
        System.out.println("Shipping \t\t " + shipping);
        System.out.println("Amount \t\t " + total);
        System.out.println("Customer Balance Left \t\t " + customer.getBalance());
    }

}
