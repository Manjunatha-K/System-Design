package com.learn.SystemDesign.StrategyDesign;

public class Vehicle {

    DriveStrategy drivestrategy;

    public Vehicle() {
    }

    public Vehicle(DriveStrategy drivestrategy) {
        this.drivestrategy = drivestrategy;
    }

    public void drive(){
        drivestrategy.drive();
    }
}
