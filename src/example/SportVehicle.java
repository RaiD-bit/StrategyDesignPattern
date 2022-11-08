package example;

public class SportVehicle extends Vehicle {
    @Override
    public void drive(){
        // this is same as sport drive capability
        // this introduces code duplication
        System.out.println("sports drive capability");
    }
}
