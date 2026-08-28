package eh;

public class Example2 {
	    public static void main(String[] args) {

	        try {
	            int a = 10;
	            int b = -1;
	            int result = a / b;
	            System.out.println(result);
	           
	            String name = "example";
	            System.out.println(name.length());
	            
	        }

	        catch (ArithmeticException ae) {
	            System.out.println("Error: Cannot divide by zero.");
	        }
	        catch (NullPointerException e) {
	            System.out.println("Cannot use a null value");
	        }
	    }
}
