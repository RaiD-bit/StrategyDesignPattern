package example;

import example.Strategy.DriveStrategy;
import example.Strategy.SportsStrategy;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle() {
        super(new SportsStrategy());
    }

}
