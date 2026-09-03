package com.learn.SystemDesign.FactoryDesignPattern.SimpleFactoryPattern;

public class Square implements Shape {
    @Override
    public void computeArea() {
        System.out.println("Square Area");
    }

    @Override
    public void draw() {
        System.out.println("Square Draw");
    }
}
