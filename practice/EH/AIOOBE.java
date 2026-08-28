package eh;

public class AIOOBE {
	    public static void main(String[] args) {

	        try {
	            int[] numbers = {10, 20, 30};

	            System.out.println(numbers[2]);
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index is out of bounds");
	        }
	    }
}
