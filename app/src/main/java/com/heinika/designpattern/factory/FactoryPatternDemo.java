package com.heinika.designpattern.factory;

public class FactoryPatternDemo {
    public void main(){
        Circle circle = (Circle) ShapeFactory.getshape("Circle");
        Square square = (Square) ShapeFactory.getshape("Square");
        Rectangle rectangle = (Rectangle) ShapeFactory.getshape("Rectangle");
        circle.draw();
        square.draw();
        rectangle.draw();
    }
}
