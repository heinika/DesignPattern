package com.heinika.designpattern.factorypattern;

public class FactoryPatternDemo {
    public void main(){
        Circle circle = (Circle) ShapeFactory.getSharp("Circle");
        Square square = (Square) ShapeFactory.getSharp("Square");
        Rectangle rectangle = (Rectangle) ShapeFactory.getSharp("Rectangle");
        circle.draw();
        square.draw();
        rectangle.draw();
    }
}
