package com.learn.SystemDesign.DecoratorDesignPattern;

public class MashroomTopping extends ToppingDecorator {
    public MashroomTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Extra Mashroom";
    }

    @Override
    public Double getCost() {
        return pizza.getCost() + 40;
    }
}
