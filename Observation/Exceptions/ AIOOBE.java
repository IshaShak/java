package exceptions;
class ArrayException {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};

        try {
            System.out.println("Accessing array element...");
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array index is out of bounds");
        }
    }
}