package com.learn.SystemDesign.SOLID.LishkovSubstitution;

public class Cycle implements Bike {
    @Override
    public void accelerate() {
        System.out.println(" Accelerate in a cycle");
    }

    @Override
    public void applyBreaks() {
        System.out.println(" Apply breaks of the cycle");
    }
}
