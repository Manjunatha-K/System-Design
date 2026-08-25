package com.learn.SystemDesign.SOLID.SingleResponsibility;

public class Demo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(5, new Marker("Reynolds", "Black", 10));
        invoice.printInvoice();

        invoice.saveToDB();

        System.out.println("from Demo main : " + invoice.calculateTotal());

        // below follows single responsibility principle
        System.out.println("below follows single responsibility principle ");
        Invoice2 invoice2 = new Invoice2(10, new Marker("Reynolds", "Black", 10));
        System.out.println(invoice2.calculateTotal());

        PrintInvoice printInvoice = new PrintInvoice();
        printInvoice.printInvoice();

        Save save = new Save();
        save.saveToDB();
    }
}
