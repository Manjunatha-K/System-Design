package com.learn.SystemDesign.AbstractFactoryDesignPattern.FactoryMethodPattern;

public class EconomyExterior implements CarExterior {
    @Override
    public void addComponents() {
        System.out.println("Basic Wheels");
    }
}
