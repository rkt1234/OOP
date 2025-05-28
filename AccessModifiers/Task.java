package AccessModifiers;

public class Task {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
        s.showInfo(); // accesses all fields through public method
    }
}
