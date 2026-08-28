package eh;

public class ThrowEx {

	    static void checkAge(int age) {
	        if (age < 18) {
	            throw new ArithmeticException("Age must be 18 or above");
	        } else {
	            System.out.println("You are eligible");
	        }
	    }

	    public static void main(String[] args) {
	    	 try {
		            checkAge(19);
		        }
		        catch (ArithmeticException e) {
		            System.out.println(e.getMessage());
		        }
		    }

}
