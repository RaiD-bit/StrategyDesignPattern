package example.Strategy;

public class PassengerStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Passenger capability");
    }
}
