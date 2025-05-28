// Create a class BankAccount with private fields accountNumber and balance. Add get and set methods for both.

package Exercises;
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }
}
public class Q4 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        // Update balance
        account.setBalance(1500.0);
        System.out.println("Updated Balance: " + account.getBalance());

        // Attempt to set a negative balance
        account.setBalance(-500.0); // Should print an error message
    }
}
