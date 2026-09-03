package com.learn.SystemDesign.AbstractFactoryDesignPattern.FactoryMethodPattern;

public interface CarFactory {
    CarExterior createExterior();

    CarInterior createInterior();

    default void produceCompleteVehicle() {
        CarExterior exterior = createExterior();
        CarInterior interior = createInterior();
        interior.addComponents();
        exterior.addComponents();
    }
}
