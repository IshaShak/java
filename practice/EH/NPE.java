package eh;

public class NPE {
	    public static void main(String[] args) {

	        try {
	            String name = "npe";
	            System.out.println(name.length());
	        }

	        catch (NullPointerException e) {
	            System.out.println("Cannot use a null value");
	        }
	    }
}
