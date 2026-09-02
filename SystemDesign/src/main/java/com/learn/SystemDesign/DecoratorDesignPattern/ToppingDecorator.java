package com.learn.SystemDesign.DecoratorDesignPattern;

public abstract class ToppingDecorator implements BasePizza{
    BasePizza pizza;

    public ToppingDecorator() {
    }

    public ToppingDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }
}
