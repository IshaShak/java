package exceptions;
class NegativeArrayException {
    public static void main(String[] args) {
        try {
            System.out.println("Creating an array...");
            int arr[] = new int[-5];
        }
        catch (NegativeArraySizeException e) {
            System.out.println("Exception: Array size cannot be negative");
        }
    }
}