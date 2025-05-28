package Constructors;

class Student {
    String name;
    int rollNumber;
    int marks;

    Student() { // non-parameterized costructor. By default any new object created will have
                // these properties
        name = "Sample 1";
        rollNumber = 100;
        marks = 100;
    }

    // Student(String name1, int rollNumber1, int marks1 ) { // parameterized
    // costructor. Whatever the constructor will receive the properties will be
    // assigned to the new object crsated
    // // these properties
    // name = name1;
    // rollNumber = rollNumber1;
    // marks = marks1;
    // }

    Student(String name, int rollNumber, int marks) { // parameterized costructor. Whatever the constructor will
                                                      // receive the properties will be assigned to the new object
                                                      // crsated
        // these properties
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Student ob1 = new Student();
        System.out.println("Below is the details of student 1");
        System.out.println(ob1.name);
        System.out.println(ob1.rollNumber);
        System.out.println(ob1.marks);

        Student ob2 = new Student("Ravi", 200, 200);
        System.out.println("Below is the details of student 2");
        System.out.println(ob2.name);
        System.out.println(ob2.rollNumber);
        System.out.println(ob2.marks);

    }
}

// We see two constructors with the same name but with different signature this
// is called Constructor overloading
// We saw the use of this keyword as well
// Refers to the current object.
// Used to distinguish between class fields and parameters with the same name.
