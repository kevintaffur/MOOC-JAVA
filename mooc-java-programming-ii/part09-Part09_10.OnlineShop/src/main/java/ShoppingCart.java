import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        if (!this.items.containsKey(product)) {
            this.items.put(product, new Item(product, 1, price));
        } else {
            this.items.get(product).increaseQuantity();
        }
    }

    public int price() {
        int sum = 0;
        for (Item item : this.items.values()) {
            sum += item.price();
        }
        return sum;
    }

    public void print() {
        for (Item item : this.items.values()) {
            System.out.println(item);
        }
    }
}
