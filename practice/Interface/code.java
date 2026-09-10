package interface;
interface Vehicle{
    void start();
    void stop();
}
class Car implements Vehicle{    
    public void start(){
        System.out.println("Car strats");
    }    
    public void stop(){
        System.out.println("car failed to start");
    }
}
public class Interface {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();
    }
    
}