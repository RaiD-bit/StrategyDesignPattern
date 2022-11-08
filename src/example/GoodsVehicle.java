package example;

import example.Strategy.DriveStrategy;
import example.Strategy.GoodsStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new GoodsStrategy());
    }
}
