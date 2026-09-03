package com.learn.SystemDesign.AbstractFactoryDesignPattern.SimpleFactoryPattern;

public class CarFactoryProducer {
    public static Object getFactory(FactoryType factoryType) {
        if (factoryType == FactoryType.EXTERIOR) {
            return new ExteriorFactory();
        } else if (factoryType == FactoryType.INTERIOR) {
            return new InteriorFactory();
        } else{
            return null;
        }
    }
}
