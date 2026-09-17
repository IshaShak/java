import java.util.Scanner;

// Interface
interface Employee {

    void displaySalary();
}


// Regular Employee class
class RegularEmployee implements Employee {

    int basicPay = 25000;
    int hra = 15000;
    int ta = 5000;

    @Override
    public void displaySalary() {

        int total = basicPay + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}


// Contract Employee class
class ContractEmployee implements Employee {

    int basicPay = 12000;
    int ta = 3000;

    @Override
    public void displaySalary() {

        int total = basicPay + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: 0");
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}


// Main class
public class EmployeeSalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        String employeeId = sc.nextLine();

        // Interface reference
        Employee employee;

        // R = Regular Employee
        if (employeeId.toUpperCase().startsWith("R")) {
            employee = new RegularEmployee();
            employee.displaySalary();
        }

        // C = Contract Employee
        else if (employeeId.toUpperCase().startsWith("C")) {
            employee = new ContractEmployee();
            employee.displaySalary();
        }

        else {
            System.out.println("Invalid Employee ID.");
        }

        sc.close();
    }
}