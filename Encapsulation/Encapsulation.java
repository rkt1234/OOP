package Encapsulation;

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount ob = new BankAccount();
        ob.deposit(1000);
        System.out.println("Balance: " + ob.getBalance());
        ob.deposit(2000);
        System.out.println("Balance: " + ob.getBalance());
    }
    
}
