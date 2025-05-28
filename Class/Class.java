// File: Main.java
class Car {
    // Attributes
    String model;
    int year;
    double price;

    // Method
    void start() {
        System.out.println(model + " is starting...");
    }

    void stop() {
        System.out.println(model + " has stopped.");
    }
}

public class Class {
    public static void main(String[] args) {
        // Creating objects
        Car car1 = new Car();
        car1.model = "Toyota Camry";
        car1.year = 2022;
        car1.price = 25000.00;

        Car car2 = new Car();
        car2.model = "Honda Accord";
        car2.year = 2023;
        car2.price = 27000.00;

        // Calling methods
        car1.start();
        car2.start();

        car1.stop();
        car2.stop();
    }
}
