import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Item item) {
        if (item.getWeight() + this.totalWeight() <= this.capacity) {
            this.items.add(item);
        }
    }

    public int totalWeight() {
        int sum = 0;
        if (this.items.isEmpty()) {
            return sum;
        }
        
        for (Item item : this.items) {
            sum += item.getWeight();
        }
        return sum;
    }

    public boolean isInBox(Item item) {
        if (this.items.contains(item)) {
            return true;
        } else {
            return false;
        }
    }
}