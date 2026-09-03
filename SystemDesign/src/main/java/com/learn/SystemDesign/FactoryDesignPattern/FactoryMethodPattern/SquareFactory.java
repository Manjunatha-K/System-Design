package com.learn.SystemDesign.FactoryDesignPattern.FactoryMethodPattern;

public class SquareFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        return new Square();
    }
}
