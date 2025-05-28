package Constructors;

class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "title";
        author = "author";
        price = 100;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class Task {
    public static void main(String[] args) {
        
        Book ob1 = new Book();
        System.out.println("Below is the first book details");
        System.out.println(ob1.author);
        System.out.println(ob1.title);
        System.out.println(ob1.price);

        Book ob2 = new Book("Rashmirathi","Ramdhari Singh Dinkar",200);
        System.out.println("Below is the second book details");
        System.out.println(ob2.author);
        System.out.println(ob2.title);
        System.out.println(ob2.price);
    }
}
