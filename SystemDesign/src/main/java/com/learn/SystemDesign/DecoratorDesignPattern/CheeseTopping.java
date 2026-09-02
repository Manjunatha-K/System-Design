package com.learn.SystemDesign.DecoratorDesignPattern;

public class CheeseTopping extends ToppingDecorator {
    public CheeseTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" Extra Cheese";
    }

    @Override
    public Double getCost() {
        return pizza.getCost()+ 20;
    }
}
