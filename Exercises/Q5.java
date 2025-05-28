// Design a base class Shape and derived classes Triangle, Square, and Circle that override a method area().
package Exercises;

abstract class Shape {
    abstract double area();
}
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
public class Q5 {
    public static void main(String[] args) {
        Shape triangle = new Triangle(5, 10);
        System.out.println("Area of Triangle: " + triangle.area());

        Shape square = new Square(4);
        System.out.println("Area of Square: " + square.area());

        Shape circle = new Circle(3);
        System.out.println("Area of Circle: " + circle.area());
    }
}