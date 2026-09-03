package com.learn.SystemDesign.AbstractFactoryDesignPattern.FactoryMethodPattern;

public class EconomyInterior implements CarInterior {
    @Override
    public void addComponents() {
        System.out.println("Basic Seats");
    }
}
