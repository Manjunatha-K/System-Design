package com.learn.SystemDesign.DecoratorDesignPattern;

public class PizzaShop {

    public static void main(String[] args) {
        BasePizza pizza1 = new PlainPizza();
        System.out.println("Order-1 : " + pizza1.getDescription() + " Rs : " + pizza1.getCost());

        BasePizza pizza2 = new CheeseTopping(new FarmHousePizza());
        System.out.println("Order-2 : " + pizza2.getDescription() + " Rs : " + pizza2.getCost());

        BasePizza pizza3 = new MashroomTopping(new PlainPizza());
        System.out.println("Order-3 : " + pizza3.getDescription() + " Rs : " + pizza3.getCost());

        BasePizza pizza4 = new MashroomTopping(new CheeseTopping(new FarmHousePizza()));
        System.out.println("Order-4 : " + pizza4.getDescription() + " Rs : " + pizza4.getCost());
    }
}
