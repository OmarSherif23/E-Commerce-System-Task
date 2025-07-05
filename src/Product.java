public abstract class Product {
    String name;
    int quantity;
    double price;
    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public abstract boolean isExpired();
    public abstract boolean shippingFees();
    public abstract double getWeight();
}
