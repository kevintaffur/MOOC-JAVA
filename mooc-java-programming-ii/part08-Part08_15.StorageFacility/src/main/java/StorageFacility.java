import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> items;

    public StorageFacility() {
        this.items = new HashMap<>();
    }

    public void add(String init, String item) {
        this.items.putIfAbsent(init, new ArrayList<>());
        this.items.get(init).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return this.items.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        this.items.get(storageUnit).remove(item);
        if (this.items.get(storageUnit).isEmpty()) {
            this.items.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String unit : this.items.keySet()) {
            if (!this.items.get(unit).isEmpty()) {
                units.add(unit);
            }
        }
        return units;
    }
}
