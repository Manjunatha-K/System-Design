package com.learn.SystemDesign.AbstractFactoryDesignPattern.SimpleFactoryPattern;

public class ExteriorFactory {

    public static CarExterior getExterior(CarType type) {
        if (type == CarType.ECONOMY) {
            return new EconomyExterior();
        } else if (type == CarType.LUXURY) {
            return new LuxuryExterior();
        } else {
            return null;
        }
    }
}
