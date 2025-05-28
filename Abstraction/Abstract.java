package Abstraction;
abstract class Animal {
    abstract void makeSound(); // Abstract method

    void breathe() {
        System.out.println("Breathing...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Animal a;
        a=new Dog();
        a.breathe();
        a.makeSound();
    }
}
