package exceptions;
class NullPointerException {
    public static void main(String[] args) {
        String str = null;

        try {
            System.out.println("Finding string length...");
            System.out.println(str.length());
        }
        catch (NullPointerException e) {
            System.out.println("Exception: String value is null");
        }
    }
}