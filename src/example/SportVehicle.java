package example;

import example.Strategy.DriveStrategy;
import example.Strategy.SportsStrategy;

public class SportVehicle extends Vehicle {
    public SportVehicle() {
        super(new SportsStrategy());
    }
}
