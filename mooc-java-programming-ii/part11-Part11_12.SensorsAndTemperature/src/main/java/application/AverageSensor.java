package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> values;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    public List<Integer> readings() {
        return this.values;
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : this.sensors) {
            sensor.setOn();
        }
    }
    
    @Override
    public void setOff() {
        for (Sensor sensor : this.sensors) {
            sensor.setOff();
        }
    }
    
    @Override
    public int read() {
        int sum = 0;
        if (this.sensors.isEmpty() && !this.isOn()) {
            throw new IllegalStateException();
        } else {
            for (Sensor sensor : this.sensors) {
                sum += sensor.read();
            }
        }
        int average = sum / this.sensors.size();
        this.values.add(average);
        return average;
    }
}
