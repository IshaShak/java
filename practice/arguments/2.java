package basics; 

public class Methods {
	void check() {
		System.out.println("method check 1");
	}
	void nextCheck () {
		System.out.println("2nd method check");
	}
	public static void main(String[] args) {
		int a = 13, b= 2; 
	int c = a+b;
		System.out.println("result is" + c);
		Methods md= new Methods();
		md.check();
		md.nextCheck();
	}
}



