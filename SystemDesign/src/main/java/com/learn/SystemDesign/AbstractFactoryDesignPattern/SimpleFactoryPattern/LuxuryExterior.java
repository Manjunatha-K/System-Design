package com.learn.SystemDesign.AbstractFactoryDesignPattern.SimpleFactoryPattern;

public class LuxuryExterior implements CarExterior {
    @Override
    public void addComponents() {
        System.out.println("Alloy Wheels");
    }
}
