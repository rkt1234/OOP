// Create a Student class with:

// Two constructors:

// One with only name

// Another with name and age

// Print the student's details from each constructor.

package Exercises;

class Student {
    String name;
    int age;

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

public class Q1 {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        System.out.println("Student 1: Name = " + student1.name + ", Age = " + student1.age);

        Student student2 = new Student("Bob", 20);
        System.out.println("Student 2: Name = " + student2.name + ", Age = " + student2.age);
    }
}
