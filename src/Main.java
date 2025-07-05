import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Product cheese = new ExpiredProduct("Cheese",LocalDate.now().plusDays(2), 0.2, 100, 5);
        Product biscuits = new ExpiredProduct("Biscuits", LocalDate.now().plusDays(5), 0.7, 150,3);
        Product tv = new ShippingProduct("TV", true, 2.0, 300, 10);
        Product scratchCard = new ShippingProduct("ScratchCard", false, 0, 50, 20);

        // Create customer
        Customer customer = new Customer(1000);

        // Create cart
        Cart cart = new Cart();
        cart.add(cheese, 2);
        cart.add(biscuits, 1);
        CheckOut.processCheckout(customer, cart);

    }
}