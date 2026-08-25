package com.learn.SystemDesign.SOLID.DependencyInjection;

public class WifiKeyboard implements Keyboard{
    @Override
    public void getSpecifications() {
        System.out.println("Wifi keyboard");
    }
}
