package com.learn.SystemDesign.AbstractFactoryDesignPattern.SimpleFactoryPattern;

public class EconomyInterior implements CarInterior{
    @Override
    public void addComponents() {
        System.out.println("Basic Seats");
    }
}
