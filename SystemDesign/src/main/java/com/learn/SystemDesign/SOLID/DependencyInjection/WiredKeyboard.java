package com.learn.SystemDesign.SOLID.DependencyInjection;

public class WiredKeyboard implements Keyboard{
    @Override
    public void getSpecifications() {
        System.out.println("Wired keyboard");
    }
}
