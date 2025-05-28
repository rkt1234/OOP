package Abstraction;

interface Remote {
    void turnOn();
    void turnOff();
}
class SmartTV implements Remote{
    @Override
    public void turnOn() {
        System.out.println("Smart TV is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart TV is turned off.");
    }
}
public class Task2 {
    public static void main(String[] args) {
        Remote mySmartTV = new SmartTV();
        mySmartTV.turnOn();
        mySmartTV.turnOff();
        
    }
}
