package com.learn.SystemDesign.AbstractFactoryDesignPattern.FactoryMethodPattern;

public class EconomyCarFactory implements CarFactory {
    @Override
    public CarExterior createExterior() {
        return new EconomyExterior();
    }

    @Override
    public CarInterior createInterior() {
        return new EconomyInterior();
    }
}
