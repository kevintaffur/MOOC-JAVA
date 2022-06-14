import java.util.ArrayList;

public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (!(this.weight() + item.weight() > this.capacity)) {
            this.items.add(item);
        }
    }
    
    public double weight() {
        double sum = 0;
        if (items.isEmpty()) {
            return sum;
        }
        for (Packable packable : this.items) {
            sum += packable.weight();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
