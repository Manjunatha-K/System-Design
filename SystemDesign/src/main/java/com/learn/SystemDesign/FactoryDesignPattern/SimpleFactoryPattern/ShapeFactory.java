package com.learn.SystemDesign.FactoryDesignPattern.SimpleFactoryPattern;


/*
This simple factory pattern violates Open close principle -(if any new shape is introduced, then we need to update the
logic to accomodate the new shape's creation logic) and Single Responsibility principle as both creation logic and
decision logic is in one class
 */
public class ShapeFactory {

    public static Shape createShape(ShapeType shapeType) {
        if (shapeType == ShapeType.CIRCLE) {
            return new Circle();
        } else if (shapeType == ShapeType.SQAURE) {
            return new Square();
        } else {
            return null;
        }
    }
}
