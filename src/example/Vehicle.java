package example;

import example.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveStrategyobj){
        this.driveStrategy = driveStrategyobj;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
