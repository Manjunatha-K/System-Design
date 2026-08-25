package com.learn.SystemDesign.SOLID.SingleResponsibility;


/* this class violates the single responsibility principle*/
public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice() {
    }

    public Invoice(int quantity, Marker marker) {
        this.quantity = quantity;
        this.marker = marker;
    }

    /*Responsibility 1:  calculate the total*/
    public int calculateTotal() {
        return this.marker.price * this.quantity;
    }

    /*Responsibility 2: saver to DB */
    public void saveToDB() {
        System.out.println("save to DB method is called");
    }

    /*Responsibility 3: print invoice*/
    public void printInvoice() {
        System.out.println("Print invoice method is called");
    }
}
