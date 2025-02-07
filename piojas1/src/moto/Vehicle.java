package moto;

import java.util.Objects;

public class Vehicle implements Comparable<Vehicle> {
    public String model;
    public int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public int compareTo(Vehicle o) {
        return Integer.compare(this.speed,o.speed);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}
