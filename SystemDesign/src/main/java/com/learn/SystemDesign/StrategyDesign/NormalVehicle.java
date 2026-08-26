package com.learn.SystemDesign.StrategyDesign;

public class NormalVehicle extends Vehicle {
    public NormalVehicle(DriveStrategy drivestrategy) {
        super(drivestrategy);
    }
}
