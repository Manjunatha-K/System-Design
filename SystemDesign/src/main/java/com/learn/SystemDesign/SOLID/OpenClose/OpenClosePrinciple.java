package com.learn.SystemDesign.SOLID.OpenClose;

public class OpenClosePrinciple {

    public static void main(String[] args) {
        InvoiceDAO2 invoiceDAO2 = new InvoiceDAO2();

        invoiceDAO2.savetoDB();

        invoiceDAO2.saveToFile();
    }
}
