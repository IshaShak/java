package interface;
interface Vehicle {
    void start(); 
}

interface ElectricVehicle extends Vehicle {
    void chargeBattery(); 
}
class Tesla implements ElectricVehicle {
    
    @Override
    public void start() {
        System.out.println("Tesla power turned on.");
    } 
    @Override
    public void chargeBattery() {
        System.out.println("Tesla battery is charging.");
    }
}
public class Interface1 {
    public static void main(String[] args) {    
        Tesla myCar = new Tesla(); 
       
        myCar.start();
        myCar.chargeBattery();
    }
}