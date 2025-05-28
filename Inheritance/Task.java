package Inheritance;

class Vehicle {
    String brand;

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    String model;

    @Override
    void start() {
        System.out.println("Car is starting "+model);
    }
}

public class Task {
    public static void main(String[] args) {

        Car ob = new Car();
        ob.brand = "brand";
        ob.model = "model";

        ob.start();

    }
}
