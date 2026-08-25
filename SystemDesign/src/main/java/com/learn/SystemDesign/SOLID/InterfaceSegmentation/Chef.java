package com.learn.SystemDesign.SOLID.InterfaceSegmentation;

public class Chef implements RestaurantChef{
    @Override
    public void prepareMeal() {
        System.out.println("Preparing the meal");
    }

    @Override
    public void gatherIngreadients() {
        System.out.println("Gathering the Ingreadients to prepare the meal");
    }
}
