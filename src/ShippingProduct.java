public class ShippingProduct extends Product implements IShipping
{
    boolean shippingFees;
    double weight;

    public ShippingProduct(String name, boolean shippingFees, double weight, double price, int quantity)
    {
        super(name,quantity,price);
        this.shippingFees = shippingFees;
        this.weight = weight;
    }

    @Override
    public boolean isExpired() {
        return false;
    }

    @Override
    public boolean shippingFees() {
        return shippingFees;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return shippingFees ? weight : 0;
    }
}
