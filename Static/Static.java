package Static;

class Counter {
    static int count = 0; // shared variable

    Counter() {
        count++;
        System.out.println("Object created. Total count: " + count);
    }

    static void displayCount() {
        System.out.println("Static Method -> Total Count: " + count);
    }

    static {
        System.out.println("Static Block -> Counter class loaded");
    }
}

public class Static {
    public static void main(String[] args) {
        Counter.displayCount(); // static method without object

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        Counter.displayCount(); // check shared count
    }
}

