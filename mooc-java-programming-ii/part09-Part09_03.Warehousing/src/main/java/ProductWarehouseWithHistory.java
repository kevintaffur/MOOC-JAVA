
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }

    public void addToWarehouse(double amount) {
        this.history.add(this.getBalance() + amount);
        super.addToWarehouse(amount);
    }

    public double takeFromWarehouse(double amount) {
        this.history.add(this.getBalance() - amount);
        return super.takeFromWarehouse(amount);
    }

    public String history() {
        return this.history.toString();
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName() + "\nHistory: " + this.history()
                + "\nLargest amount of product: " + this.history.maxValue()
                + "\nSmallest amount of product: " + this.history.minValue()
                + "\nAverage: " + this.history.average());
    }
}
