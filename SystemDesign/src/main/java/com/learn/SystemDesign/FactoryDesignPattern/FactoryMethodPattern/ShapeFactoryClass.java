package com.learn.SystemDesign.FactoryDesignPattern.FactoryMethodPattern;


/*
This method still violates open close principle, as in-future, if any new shape is implemented, then we need to update the object creation logic
 */
public class ShapeFactoryClass {
    public static Shape getShapeInstance(ShapeType shapeType) {
        Shape shape;
        if (shapeType == ShapeType.CIRCLE) {
            ShapeFactory circleFactory = new CircleFactory();
            shape = circleFactory.createShape();
        } else if (shapeType == ShapeType.SQAURE) {
            ShapeFactory squareFactory = new SquareFactory();
            shape = squareFactory.createShape();
        } else {
            throw new IllegalStateException("Shape doesn't exist");
        }
        return shape;
    }
}
