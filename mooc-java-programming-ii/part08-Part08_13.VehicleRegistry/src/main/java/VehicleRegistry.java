import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicles;

    public VehicleRegistry() {
        this.vehicles = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.vehicles.containsKey(licensePlate)) {
            this.vehicles.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }
    
    public String get(LicensePlate licensePlate) {
        if (this.vehicles.containsKey(licensePlate)) {
            return this.vehicles.get(licensePlate);
        } else {
            return null;
        }
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (this.vehicles.containsKey(licensePlate)) {
            this.vehicles.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : this.vehicles.keySet()) {
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> ownersPrinted = new ArrayList<>();
        for (String owner : this.vehicles.values()) {
            if (!ownersPrinted.contains(owner)) {
                ownersPrinted.add(owner);
                System.out.println(owner);
            }
        }
    }
}
