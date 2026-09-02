package com.learn.SystemDesign.DecoratorDesignPattern;

public class PlainPizza implements BasePizza {
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public Double getCost() {
        return new Double(300);
    }
}
