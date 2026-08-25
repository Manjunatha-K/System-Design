package com.learn.SystemDesign.SOLID.DependencyInjection;

public class BluetoothKeyboard implements Keyboard{
    @Override
    public void getSpecifications() {
        System.out.println("Bluetooth keyboard");
    }
}
