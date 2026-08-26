package com.learn.SystemDesign.SOLID.LishkovSubstitution.example;

import java.util.Scanner;

public class PaymentService {
    public void processpayments(PaymentMethod method) {
        method.pay(10);
    }

    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount you want to pay");
        int amount = sc.nextInt();

        System.out.println("Choose the payment Method");
        System.out.println("Press 1 -> UPI");
        System.out.println("Press 2 -> Credit card");
        System.out.println("Press 3 -> Debit card");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                PaymentMethod Upimethod = new UpiPayment(amount);
                service.processpayments(Upimethod);
                break;
            case 2:
                PaymentMethod Creditmethod = new CreditCardPayment(amount);
                service.processpayments(Creditmethod);
                break;
            case 3:
                PaymentMethod DebitMethod = new DebitcardPayment(amount);
                service.processpayments(DebitMethod);
                break;
            default:
                System.out.println("Invalid Payment method choosen");
        }
    }
}
