package com.learn.SystemDesign.AbstractFactoryDesignPattern.FactoryMethodPattern;

public class CarFactoryProvider {

    public CarFactory getFactory(CarType type) {
        switch (type) {
            case CarType.ECONOMY:
                return new EconomyCarFactory();
            case CarType.LUXURY:
                return new LuxuryCarFactory();
            default:
                return null;
        }
    }
}
