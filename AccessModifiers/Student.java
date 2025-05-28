package AccessModifiers;

public class Student extends Person {
    public void display() {
        System.out.println("Name: " + name);      // public ✅
        System.out.println("Age: " + age);        // protected ✅
        System.out.println("Gender: " + gender);  // default ✅
        // System.out.println("Secret: " + secret); ❌ private
    }
}
