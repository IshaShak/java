package exceptions;
class NumberException {
    public static void main(String[] args) {
        String str = "Hello";

        try {
            System.out.println("Converting string into number...");
            int n = Integer.parseInt(str);
            System.out.println(n);
        }
        catch (NumberFormatException e) {
            System.out.println("Exception: String cannot be converted into a number");
        }
    }
}