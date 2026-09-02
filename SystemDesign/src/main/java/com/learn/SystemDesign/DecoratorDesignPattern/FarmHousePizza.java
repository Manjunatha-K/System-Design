package com.learn.SystemDesign.DecoratorDesignPattern;

public class FarmHousePizza implements BasePizza {
    @Override
    public String getDescription() {
        return "FarmHouse Pizza";
    }

    @Override
    public Double getCost() {
        return new Double(200);
    }
}
