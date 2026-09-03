package com.learn.SystemDesign.FactoryDesignPattern.FactoryMethodPattern;

public class Client {
    public static void main(String[] args) {
        Shape circle = ShapeFactoryClass.getShapeInstance(ShapeType.CIRCLE);
        circle.draw();
        circle.computeArea();

        Shape square = ShapeFactoryClass.getShapeInstance(ShapeType.SQAURE);
        square.computeArea();
        square.draw();
    }
}
