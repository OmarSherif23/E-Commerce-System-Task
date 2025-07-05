import java.time.LocalDate;

public class ExpiredProduct extends Product implements IShipping
{
    LocalDate expirationDate;
    double weight;
    public ExpiredProduct(String name, LocalDate expirationDate, double weight, double price, int quantity)
    {
        super(name,quantity,price);
        this.expirationDate = expirationDate;
        this.weight = weight;
    }

    @Override
    public boolean isExpired() {
        return LocalDate.now().isAfter(expirationDate);
    }

    @Override
    public boolean shippingFees() {
        return true;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
