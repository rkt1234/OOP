package Inheritance;

class Parent {
    void greet() {
        System.out.println("Hello from Parent!");
    }

    void speak() {
        System.out.println("Hello I am the parent");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is Child.");
    }
    
    void speak() {
        System.out.println("Hello I am the child");
    }

    void callTheParentSpeack() {
        super.speak();
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Parent p = new Parent();
        // p.greet(); 
        Child c = new Child();
        // c.display(); 
        // c.greet(); // child has access to the parent class method

        p.speak();
        c.speak();
        c.callTheParentSpeack();
    }
}
