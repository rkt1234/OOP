package Polymorphism;

class Shape {
    void area() {
        System.out.println("Calculating area of the shape");
    }
}

class Circle extends Shape {
    @Override
    void area() {
        System.out.println("Calculating area of the circle");
    }
}

class Rectangle extends Shape {
    @Override
    void area() {
        System.out.println("Calculating area of the rectangle");
    }
}

public class Task {
    public static void main(String[] args) {
        Shape s;
        s=new Circle();
        s.area(); // Calculating area of the circle
        s=new Rectangle();
        s.area(); // Calculating area of the rectangle

    }
}
