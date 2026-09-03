package com.learn.SystemDesign.AbstractFactoryDesignPattern.SimpleFactoryPattern;

public class LuxuryInterior implements CarInterior{
    @Override
    public void addComponents() {
        System.out.println("Premium Seats");
    }
}
