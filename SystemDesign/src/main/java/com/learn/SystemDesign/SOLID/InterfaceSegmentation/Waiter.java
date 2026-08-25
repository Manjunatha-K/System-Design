package com.learn.SystemDesign.SOLID.InterfaceSegmentation;

public class Waiter implements RestaurantWaiter {
    @Override
    public void takeOrders() {
        System.out.println("Taking Orders");
    }

    @Override
    public void provideBill() {
        System.out.println("Generating the Bill");
    }
}
