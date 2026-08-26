package com.learn.SystemDesign.StrategyDesign;

public class OffRoadDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("OFFROAD DRIVE");
    }
}
