package com.learn.SystemDesign.AbstractFactoryDesignPattern.SimpleFactoryPattern;

public class EconomyExterior implements CarExterior {
    @Override
    public void addComponents() {
        System.out.println("Basic Wheels");
    }
}
