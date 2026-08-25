package com.learn.SystemDesign.SOLID.InterfaceSegmentation;

public class InterfaceSegmentationPrinciple {

    public static void main(String[] args) {
        RestaurantWaiter waiter = new Waiter();
        RestaurantChef chef = new Chef();

        waiter.takeOrders();
        waiter.provideBill();

        chef.gatherIngreadients();
        chef.prepareMeal();

    }
}
