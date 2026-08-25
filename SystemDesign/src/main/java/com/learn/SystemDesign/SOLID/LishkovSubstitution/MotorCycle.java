package com.learn.SystemDesign.SOLID.LishkovSubstitution;

public class MotorCycle implements Bike, Engine {
    @Override
    public void accelerate() {
        System.out.println("Accelerate in Bike");
    }

    @Override
    public void applyBreaks() {
        System.out.println(" Applying breaks of an Bike");
    }

    @Override
    public void turnOnEngine() {
        System.out.println("Turn on engine of a bike");
    }

    @Override
    public void turnOffEngine() {
        System.out.println(" Turn of Engine of a bike");
    }
}
