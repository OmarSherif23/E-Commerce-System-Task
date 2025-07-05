import java.util.List;

public class ShippingService {
    public static void ship(List<CartItem> items){
        double total = 0;
        System.out.println("** Shipment Notice **");
        for(CartItem item : items)
        {
            if(item.product.shippingFees())
            {
                double itemWeight = item.product.getWeight() * item.quantity;
                total += itemWeight;
                System.out.println(item.quantity + "X " + item.product.name + "\t\t" +  itemWeight*1000 +" g");
            }
        }
        System.out.println("Total Package Weight: " + total +" kg");
    }
}
