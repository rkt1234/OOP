package Abstraction;
interface Remote {
    void turnOn();
    void turnOff();
}

class TV implements Remote {
    public void turnOn() {
        System.out.println("TV is on");
    }

    public void turnOff() {
        System.out.println("TV is off");
    }
}

public class Interface {
    public static void main(String[] args) {
        Remote myTV = new TV();
        myTV.turnOn();
        myTV.turnOff();
    }
}
