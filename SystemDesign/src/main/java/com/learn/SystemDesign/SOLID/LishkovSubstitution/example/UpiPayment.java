package com.learn.SystemDesign.SOLID.LishkovSubstitution.example;

public class UpiPayment implements  PaymentMethod{
    int amount;

    public UpiPayment(int amount) {
        this.amount = amount;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payed Rs: "+amount+" via UPI");
    }
}
