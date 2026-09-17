package exceptions;
class Demo {
    private Demo() {
    }
}

class AccessDemo {
    public static void main(String[] args) {
        try {
            Class.forName("Demo").newInstance();
        }
        catch (IllegalAccessException e) {
            System.out.println("Exception: Access is not allowed");
        }
        catch (InstantiationException e) {
            System.out.println("Object cannot be created");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}