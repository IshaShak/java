package exceptions;
abstract class Demo {
}

class InstantiationDemo {
    public static void main(String[] args) {
        try {
            Class.forName("Demo").newInstance();
        }
        catch (InstantiationException e) {
            System.out.println("Exception: Object cannot be created");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}