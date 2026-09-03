package com.learn.SystemDesign.AbstractFactoryDesignPattern.SimpleFactoryPattern;

public class Client {
    public static void main(String[] args) {
        InteriorFactory interiorFactory = (InteriorFactory) CarFactoryProducer.getFactory(FactoryType.INTERIOR);
        CarInterior interior = interiorFactory.getInterior(CarType.LUXURY);
        interior.addComponents();

        ExteriorFactory exteriorFactory = (ExteriorFactory) CarFactoryProducer.getFactory(FactoryType.EXTERIOR);
        CarExterior exterior = exteriorFactory.getExterior(CarType.LUXURY);
        exterior.addComponents();
    }
}
