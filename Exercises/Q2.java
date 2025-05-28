// Create a Person class with a work() method. 
// Create a Doctor class that extends Person and overrides the work() method.

package Exercises;

class Person {
    public void work() {
        System.out.println("Person is working.");
    }
}

class Doctor extends Person {
    @Override
    public void work() {
        System.out.println("Doctor is treating patients.");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.work(); // Output: Person is working.

        Doctor doctor = new Doctor();
        doctor.work(); // Output: Doctor is treating patients.
    }
}
