package example;

public class OffRoadVehicle extends Vehicle{
    @Override
    public void drive(){
        // this is same as sport drive capability
        // this introduces code duplication
        System.out.println("sport drive capability");
    }
}
