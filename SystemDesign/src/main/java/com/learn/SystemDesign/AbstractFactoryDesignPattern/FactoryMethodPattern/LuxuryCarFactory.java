package com.learn.SystemDesign.AbstractFactoryDesignPattern.FactoryMethodPattern;

public class LuxuryCarFactory implements CarFactory {
    @Override
    public CarExterior createExterior() {
        return new LuxuryExterior();
    }

    @Override
    public CarInterior createInterior() {
        return new LuxuryInterior();
    }
}
