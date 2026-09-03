package com.learn.SystemDesign.FactoryDesignPattern.SimpleFactoryPattern;

public class Client {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape(ShapeType.CIRCLE);
        circle.computeArea();
        circle.draw();

        Shape square = ShapeFactory.createShape(ShapeType.SQAURE);
        square.computeArea();
        square.draw();
    }
}
