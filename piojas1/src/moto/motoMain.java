package moto;

public class motoMain {
    public static void main(String[]args){
        Vehicle[]vh={
                new Vehicle("Toyota", 180),
                new Vehicle("BMW", 220),
                new Vehicle("Audi", 200),
                new Vehicle("Ford", 160),
                new Vehicle("Mercedes", 240)
        };
        Vehicle fast = Metody.maxValue(vh);
        System.out.println(fast);
    }
}

