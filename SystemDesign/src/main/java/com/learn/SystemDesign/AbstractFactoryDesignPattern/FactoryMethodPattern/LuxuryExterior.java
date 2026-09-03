package com.learn.SystemDesign.AbstractFactoryDesignPattern.FactoryMethodPattern;

public class LuxuryExterior implements CarExterior {
    @Override
    public void addComponents() {
        System.out.println("Alloy Wheels");
    }
}
