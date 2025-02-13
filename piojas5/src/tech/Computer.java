package tech;

public class Computer implements Comparable<Computer> {
    public double processorSpeed;
    public String brand;

    public Computer(double processorSpeed, String brand) {
        this.processorSpeed = processorSpeed;
        this.brand = brand;
    }

    @Override
    public int compareTo(Computer o) {
        int c =Double.compare(this.processorSpeed,o.processorSpeed);
        return (c!=0)?c:this.brand.compareTo(o.brand);

    }

    @Override
    public String toString() {
        return "Computer{" +
                "processorSpeed=" + processorSpeed +
                ", brand='" + brand + '\'' +
                '}';
    }
}
