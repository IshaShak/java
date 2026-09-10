package exceptions;
class MethodDemo {
    public void show() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        try {
            MethodDemo obj = new MethodDemo();
            obj.getClass().getMethod("display");
        }
        catch (NoSuchMethodException e) {
            System.out.println("Exception: Method not found");
        }
    }
}