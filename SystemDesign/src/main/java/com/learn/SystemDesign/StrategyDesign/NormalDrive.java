package com.learn.SystemDesign.StrategyDesign;

public class NormalDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("NORMAL DRIVE");
    }
}
