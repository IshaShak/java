package basics;
public class Methods {   
   public int add(int a, int b) {
        return (a + b);
    }
    public static void main(String[] args) {
        Methods obj = new Methods();
        int sum = obj.add(10, 20);

        System.out.println("Sum = " + sum);
    }
}

