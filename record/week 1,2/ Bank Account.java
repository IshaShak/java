package recordprograms;
        import java.util.Scanner;
// Bank Account Management System
// Demonstrates OOP concepts in Java

// Abstract class - demonstrates Data Abstraction
abstract class Account {

    // Private attributes - demonstrates Encapsulation
    private String accountNumber;
    private double balance;
    private String accountType;

    // Constructor
    public Account(String accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
            System.out.println("New Balance: Rs." + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Protected method allows child classes to modify balance
    protected void deductBalance(double amount) {
        balance -= amount;
    }

    protected void addBalance(double amount) {
        balance += amount;
    }

    // Abstract method - demonstrates Abstraction
    public abstract void withdraw(double amount);

    // Abstract method for interest
    public abstract void calculateInterest();

    // Transfer money from one account to another
    public void transfer(Account receiver, double amount) {

        if (amount <= 0) {
            System.out.println("Invalid transfer amount.");
            return;
        }

        if (this.getBalance() >= amount) {
            this.deductBalance(amount);
            receiver.addBalance(amount);

            System.out.println("Transfer Successful!");
            System.out.println("Transferred Rs." + amount +
                    " from " + this.accountNumber +
                    " to " + receiver.getAccountNumber());
        } else {
            System.out.println("Insufficient balance for transfer.");
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : Rs." + balance);
    }
}


// Savings Account - Inheritance
class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(String accountNumber,
                          double balance,
                          double interestRate) {

        super(accountNumber, balance, "Savings Account");
        this.interestRate = interestRate;
    }

    // Method Overriding - Polymorphism
    @Override
    public void withdraw(double amount) {

        if (amount > 0 && amount <= getBalance()) {
            deductBalance(amount);

            System.out.println("Withdrawal Successful!");
            System.out.println("Withdrawn: Rs." + amount);
            System.out.println("Remaining Balance: Rs." + getBalance());
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method Overriding
    @Override
    public void calculateInterest() {

        double interest = getBalance() * interestRate / 100;

        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Earned: Rs." + interest);

        addBalance(interest);

        System.out.println("Balance after interest: Rs." + getBalance());
    }
}


// Current Account - Inheritance
class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(String accountNumber,
                          double balance,
                          double overdraftLimit) {

        super(accountNumber, balance, "Current Account");
        this.overdraftLimit = overdraftLimit;
    }

    // Method Overriding - Polymorphism
    @Override
    public void withdraw(double amount) {

        if (amount > 0 &&
            amount <= getBalance() + overdraftLimit) {

            deductBalance(amount);

            System.out.println("Withdrawal Successful!");
            System.out.println("Withdrawn: Rs." + amount);
            System.out.println("Remaining Balance: Rs." + getBalance());
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }

    // Current account does not normally earn interest
    @Override
    public void calculateInterest() {
        System.out.println("Current Account does not earn interest.");
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}


// Main class
public class BankAccountManagement {

    public static void main(String[] args) {

        // Creating objects
        // Demonstrates Objects and Classes

        SavingsAccount savings =
                new SavingsAccount("SA1001", 10000, 5);

        CurrentAccount current =
                new CurrentAccount("CA2001", 20000, 5000);


        // Display account details
        System.out.println("===== ACCOUNT DETAILS =====");

        savings.displayAccountDetails();
        current.displayAccountDetails();


        // Deposit
        System.out.println("\n===== DEPOSIT =====");

        savings.deposit(5000);
        current.deposit(3000);


        // Withdrawal
        System.out.println("\n===== WITHDRAWAL =====");

        savings.withdraw(2000);
        current.withdraw(25000);


        // Calculate Interest
        System.out.println("\n===== INTEREST =====");

        savings.calculateInterest();
        current.calculateInterest();


        // Transfer
        System.out.println("\n===== TRANSFER =====");

        savings.transfer(current, 3000);


        // Demonstrating Polymorphism and Dynamic Binding
        System.out.println("\n===== POLYMORPHISM & DYNAMIC BINDING =====");

        Account account1 = new SavingsAccount(
                "SA3001", 15000, 4);

        Account account2 = new CurrentAccount(
                "CA4001", 25000, 10000);

        // Java determines the actual method
        // at runtime based on the object.
        account1.withdraw(2000);
        account2.withdraw(30000);

        account1.calculateInterest();
        account2.calculateInterest();


        // Final account details
        System.out.println("\n===== FINAL ACCOUNT DETAILS =====");

        savings.displayAccountDetails();
        current.displayAccountDetails();
    }
}