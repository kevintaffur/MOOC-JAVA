import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int max;

    public Suitcase(int max) {
        this.items = new ArrayList<>();
        this.max = max;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() > this.max) {
            return;
        } else {
            this.items.add(item);
        }
    }

    public int totalWeight() {
        if (this.items.isEmpty()) {
            return 0;
        }
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviest = new Item("Heaviest", 0);
        for (Item item : this.items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

    @Override
    public String toString() {
        String items = "items";
        if (this.items.size() == 0) {
            items = "no items";
        } else if(this.items.size() == 1) {
            items = "item";
        }
        return this.items.size() + items + this.totalWeight() + " kg)";
    }


}
