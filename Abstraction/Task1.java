package Abstraction;
abstract class Appliance {
    Appliance() {
        System.out.println("Appliance is created.");
    }
    abstract void turnOff();
    abstract void turnOn();
}
class WashingMachine extends Appliance {
    @Override
    void turnOff() {
        System.out.println("Washing Machine is turned off.");
    }

    @Override
    void turnOn() {
        System.out.println("Washing Machine is turned on.");
    }
}
public class Task1 {
    public static void main(String[] args) {
        Appliance appliance = new WashingMachine();
        appliance.turnOn();
        appliance.turnOff();
        
    }

}
