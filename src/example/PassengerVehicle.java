package example;

import example.Strategy.DriveStrategy;
import example.Strategy.PassengerStrategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle() {
        super(new PassengerStrategy());
    }

    @Override
    public void drive(){
        System.out.println("passenger drive capability");
    }
}
