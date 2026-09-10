package basics;
public class Method {
    public static multiplyNumbers(int a , int b){
    return a+b;
}
 public static void name(String name){
    System.out.println("hello"+name+".");
}
public static void main(String[] args) {
    int mul=multiplyNumbers(5,10);
    System.out.println("the mul is:"+ mul);
    name("sufiyy");
 }
}