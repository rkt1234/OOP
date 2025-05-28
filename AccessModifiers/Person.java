package AccessModifiers;

public class Person {
    public String name = "Public Name";
    protected int age = 25;
    String gender = "Default Gender";
    private String secret = "Private Info";

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Secret: " + secret);
    }
}
