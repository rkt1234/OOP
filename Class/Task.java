class Student {
    String name;
    int rollNumber;
    int marks;

    void displayDetails() {
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(marks);
    }
}
public class Task {
    public static void main(String[] args) {
        Student ob = new Student();
        ob.name = "Ravikant";
        ob.rollNumber = 100;
        ob.marks = 100;

        ob.displayDetails();
    }
}
