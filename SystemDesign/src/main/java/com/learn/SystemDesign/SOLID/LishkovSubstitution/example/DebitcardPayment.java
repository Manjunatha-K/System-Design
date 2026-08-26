package com.learn.SystemDesign.SOLID.LishkovSubstitution.example;

public class DebitcardPayment implements PaymentMethod {
    int amount;

    public DebitcardPayment(int amount) {
        this.amount = amount;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payed Rs: " + amount + " via Debit Card");
    }
}
