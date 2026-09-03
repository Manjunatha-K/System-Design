package com.learn.SystemDesign.AbstractFactoryDesignPattern.SimpleFactoryPattern;

public class InteriorFactory {
    public static CarInterior getInterior(CarType type) {
        if (type == CarType.ECONOMY) {
            return new EconomyInterior();
        } else if (type == CarType.LUXURY) {
            return new LuxuryInterior();
        } else {
            return null;
        }
    }
}
