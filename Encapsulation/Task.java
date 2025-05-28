package Encapsulation;

class Employee {
    private String name;
    private int id;
    private double salary;

    void get() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    void set(String name,int id,double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}

public class Task {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.set("John Doe", 12345, 50000.0);
        emp.get();
        
        emp.set("Jane Smith", 67890, 60000.0);
        emp.get();
    }
}
