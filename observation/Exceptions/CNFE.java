package exceptions;
class ClassNotFoundDemo {
    public static void main(String[] args) {
        try {
            Class.forName("ABC");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Exception: Class not found");
        }
    }
}