package com.learn.SystemDesign.StrategyDesign;

public class SportDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("SPORT DRIVE");
    }
}
