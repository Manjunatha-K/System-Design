package com.learn.SystemDesign.FactoryDesignPattern.FactoryMethodPattern;

import com.learn.SystemDesign.FactoryDesignPattern.FactoryMethodPattern.Shape;

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
