package com.learn.SystemDesign.AbstractFactoryDesignPattern.FactoryMethodPattern;

import com.learn.SystemDesign.AbstractFactoryDesignPattern.SimpleFactoryPattern.CarFactoryProducer;

public class Client {
    public static void main(String[] args) {
        CarFactoryProvider factoryProvider = new CarFactoryProvider();
        CarFactory economycar = factoryProvider.getFactory(CarType.ECONOMY);

        economycar.produceCompleteVehicle();
    }
}
