import java.util.*;

// Customer class
class Customer {
    String name;
    String location;

    // Constructor
    Customer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Send order
    void sendOrder() {
        System.out.println(name + " has sent the order.");
    }

    // Receive order
    void receiveOrder() {
        System.out.println(name + " has received the order.");
    }
}


// Order class - Parent class
class Order {
    String date;
    String number;

    // Constructor
    Order(String date, String number) {
        this.date = date;
        this.number = number;
    }

    // Confirm order
    void confirm() {
        System.out.println("Order " + number + " is confirmed.");
    }

    // Close order
    void close() {
        System.out.println("Order " + number + " is closed.");
    }
}


// SpecialOrder inherits Order
class SpecialOrder extends Order {

    SpecialOrder(String date, String number) {
        super(date, number);
    }

    // Dispatch special order
    void dispatch() {
        System.out.println("Special order " + number + " is dispatched.");
    }
}


// NormalOrder inherits Order
class NormalOrder extends Order {

    NormalOrder(String date, String number) {
        super(date, number);
    }

    // Dispatch normal order
    void dispatch() {
        System.out.println("Normal order " + number + " is dispatched.");
    }

    // Receive normal order
    void receive() {
        System.out.println("Normal order " + number + " is received.");
    }
}


// Main class
public class OrderManagement {

    public static void main(String[] args) {

        // Creating Customer object
        Customer customer =
                new Customer("Rahul", "Chennai");

        // Creating Special Order object
        SpecialOrder specialOrder =
                new SpecialOrder("26-08-2026", "S001");

        // Creating Normal Order object
        NormalOrder normalOrder =
                new NormalOrder("26-08-2026", "N001");


        // Customer operations
        System.out.println("===== CUSTOMER =====");

        System.out.println("Name     : " + customer.name);
        System.out.println("Location : " + customer.location);

        customer.sendOrder();


        // Special order operations
        System.out.println("\n===== SPECIAL ORDER =====");

        System.out.println("Date   : " + specialOrder.date);
        System.out.println("Number : " + specialOrder.number);

        specialOrder.confirm();
        specialOrder.dispatch();
        specialOrder.close();


        // Normal order operations
        System.out.println("\n===== NORMAL ORDER =====");

        System.out.println("Date   : " + normalOrder.date);
        System.out.println("Number : " + normalOrder.number);

        normalOrder.confirm();
        normalOrder.dispatch();
        normalOrder.receive();
        normalOrder.close();


        // Customer receives order
        System.out.println("\n===== ORDER DELIVERY =====");

        customer.receiveOrder();
    }
}