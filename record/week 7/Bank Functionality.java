package recordprograms;
        import java.util.Scanner;

// Base class
class RBI {

    // Minimum interest rate fixed by RBI
    double getRateOfInterest() {
        return 4.0;
    }
}


// SBI inherits RBI
class SBI extends RBI {

    // Method overriding
    @Override
    double getRateOfInterest() {
        return 7.0;
    }
}


// ICICI inherits RBI
class ICICI extends RBI {

    // Method overriding
    @Override
    double getRateOfInterest() {
        return 7.5;
    }
}


// PNB inherits RBI
class PNB extends RBI {

    // Method overriding
    @Override
    double getRateOfInterest() {
        return 6.5;
    }
}


// Customer class
class Customer {

    String name;
    String accountNumber;

    Customer(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    void displayCustomer() {
        System.out.println("Customer Name  : " + name);
        System.out.println("Account Number : " + accountNumber);
    }
}


// Main class
public class BankDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
            "Enter the Bank name to find the rate of Interest : "
        );

        String bankName = sc.nextLine();

        // Parent class reference
        // Dynamic polymorphism
        RBI bank;

        if (bankName.equalsIgnoreCase("RBI")) {
            bank = new RBI();
        }
        else if (bankName.equalsIgnoreCase("SBI")) {
            bank = new SBI();
        }
        else if (bankName.equalsIgnoreCase("ICICI")) {
            bank = new ICICI();
        }
        else if (bankName.equalsIgnoreCase("PNB")) {
            bank = new PNB();
        }
        else {
            System.out.println("Invalid bank name.");
            sc.close();
            return;
        }

        // Method is selected at runtime
        System.out.println(
            bankName.toUpperCase() +
            " rate of interest is : " +
            bank.getRateOfInterest() + "%"
        );

        sc.close();
    }
}