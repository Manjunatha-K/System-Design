package com.learn.SystemDesign.SOLID.SingleResponsibility;

public class Invoice2 {
    private Marker marker;
    private int quantity;

    public Invoice2() {
    }

    public Invoice2(int quantity, Marker marker) {
        this.quantity = quantity;
        this.marker = marker;
    }

    public int calculateTotal() {
        return this.marker.price * this.quantity;
    }
}
