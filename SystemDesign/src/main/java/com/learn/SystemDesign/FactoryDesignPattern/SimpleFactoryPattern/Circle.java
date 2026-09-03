package com.learn.SystemDesign.FactoryDesignPattern.SimpleFactoryPattern;

public class Circle implements Shape{
    @Override
    public void computeArea() {
        System.out.println("Circle Area");
    }

    @Override
    public void draw() {
        System.out.println("Circle Draw");
    }
}
