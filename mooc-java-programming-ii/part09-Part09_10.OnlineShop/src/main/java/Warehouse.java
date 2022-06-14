import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.products = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        if (this.products.containsKey(product)) {
            return this.products.get(product);
        } else {
            return -99;
        }
    }

    public int stock(String product) {
        if (!this.stock.containsKey(product)) {
            return 0;
        } else {
            return this.stock.get(product);
        }
    }

    public boolean take(String product) {
        if (this.stock.containsKey(product)) {
            if (this.stock.get(product) == 0) {
                return false;
            }

            int currentStock = this.stock.get(product);
            this.stock.put(product, currentStock - 1);

            if (this.stock.get(product) != 0) {
                return true;
            }
        }
        return false;
    }

    public Set<String> products() {
        return this.products.keySet();
    }


}
