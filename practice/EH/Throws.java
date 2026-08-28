package eh;

public class ThrowsEx {

	    static void checkAge(int age) throws Exception {
	        if (age < 18) {
	            throw new Exception("You are not eligible to vote");
	        } else {
	            System.out.println("You are eligible to vote");
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            checkAge(20);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
