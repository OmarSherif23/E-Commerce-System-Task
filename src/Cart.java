import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<CartItem> items = new ArrayList<>();
    public void add(Product product, int quantity)
    {
        items.add(new CartItem(product,quantity));
    }
    public List<CartItem> getItems() {
        return items;
    }
    public boolean isEmpty() {
        return items.isEmpty();
    }
}
