package arrays;
public class ArrayExample {
    public static void main(String[] args) {        
        int[] numbers = new int[5]; 
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        System.out.println("First fruit: " + fruits[0]); 
        System.out.println("All numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
    }
}