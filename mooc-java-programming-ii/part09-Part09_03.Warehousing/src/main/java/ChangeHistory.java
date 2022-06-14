import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> changesHistory;

    public ChangeHistory() {
        this.changesHistory = new ArrayList<>();
    }

    public void add(double status) {
        this.changesHistory.add(status);
    }

    public void clear() {
        this.changesHistory.clear();
    }

    public double maxValue() {
        double max = 0;
        if (this.changesHistory.isEmpty()) {
            return 0.0;
        } else {
            for (Double value : this.changesHistory) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    public double minValue() {
        double min = this.changesHistory.get(0);
        if (this.changesHistory.isEmpty()) {
            return 0.0;
        } else {
            for (Double value : this.changesHistory) {
                if (value < min) {
                    min = value;
                }
            }
        }
        return min;
    }

    public double average() {
        double sum = 0.0;
        int counter = 0;
        if (this.changesHistory.isEmpty()) {
            return 0.0;
        } else {
            for (Double value : this.changesHistory) {
                sum += value;
                counter++;
            }
        }
        return sum / counter;
    }

    public String toString() {
        return this.changesHistory.toString();
    }
}
