package com.learn.SystemDesign.SOLID.LishkovSubstitution.example;

public class CreditCardPayment implements PaymentMethod {
    int amount;

    public CreditCardPayment(int amount) {
        this.amount = amount;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payed Rs: " + amount + " via Credit Card");
    }
}
