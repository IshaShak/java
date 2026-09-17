package exceptions;
class ArrayStore {
    public static void main(String[] args) {
        String arr[] = new String[2];

        try {
            Object obj[] = arr;
            obj[0] = 100;
        }
        catch (ArrayStoreException e) {
            System.out.println("Exception: Cannot store Integer in String array");
        }
    }
}