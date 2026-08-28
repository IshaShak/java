/*
 * Hybrid inheritance is a combination of two or more
 * types of inheritance.
 *
 * Java does not support hybrid inheritance using
 * classes alone because of the ambiguity problem.
 *
 * We can achieve a hybrid structure using classes
 * together with interfaces.
 *
 *              Employee
 *                  |
 *               Manager
 *               /     \
 *              /       \
 *        Developer     Tester
 *           |             |
 *      Programmer      Testable
 *       interface       interface
 *
 * Developer:
 * - extends Manager
 * - implements Programmer
 *
 * Tester:
 * - extends Manager
 * - implements Testable
 */

static class Employee {

    void work() {
        System.out.println("Employee is working.");
    }
}

static class Manager extends Employee {

    void manage() {
        System.out.println("Manager is managing the team.");
    }
}

interface Programmer {

    void code();
}

interface Testable {

    void test();
}

static class Developer extends Manager implements Programmer {

    @Override
    public void code() {
        System.out.println("Developer is writing code.");
    }
}

static class Tester extends Manager implements Testable {

    @Override
    public void test() {
        System.out.println("Tester is testing the application.");
    }
}
public static void main(String[] args) {

Developer developer = new Developer();
Tester tester = new Tester();

/*
 * Developer inherits work() from Employee through Manager.
 */
developer.work();

/*
 * Developer inherits manage() from Manager.
 */
developer.manage();

/*
 * Developer implements Programmer,
 * so it must provide the code() method.
 */
developer.code();

System.out.println();

/*
 * Tester inherits work() from Employee through Manager.
 */
tester.work();

/*
 * Tester inherits manage() from Manager.
 */
tester.manage();

/*
 * Tester implements Testable,
 * so it provides the test() method.
 */
tester.test();
}
