package com.learn.SystemDesign.SOLID.LishkovSubstitution;

/*
Objects of superclass should be replacable with objects of it subclass with breaking the application
*/
public class Lishkov {

    public static void main(String[] args){
        MotorCycle motorCycle = new MotorCycle();
        Cycle cycle = new Cycle();

        motorCycle.accelerate();
        motorCycle.turnOnEngine();
        motorCycle.turnOffEngine();
        motorCycle.applyBreaks();

        cycle.accelerate();
        cycle.applyBreaks();
    }
}
