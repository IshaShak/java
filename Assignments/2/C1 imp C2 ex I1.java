// File: Main.java

// 1. Interface
interface I1 {
    void showInterfaceMethod();
}

// 2. Base Class
class C2 {
    void showSuperclassMethod() {
        System.out.println("Method from superclass C2");
    }
}

// 3. Class C1 extends Class C2 AND implements Interface I1
// (Rule: 'extends' MUST always come before 'implements')
class C1 extends C2 implements I1 {

    @Override
    public void showInterfaceMethod() {
        System.out.println("Method implemented from interface I1");
    }
}

// Main execution class
public class Main {
    public static void main(String[] args) {
        C1 obj = new C1();

        // Accessing inherited method from superclass C2
        obj.showSuperclassMethod();

        // Accessing implemented method from interface I1
        obj.showInterfaceMethod();
    }
}
