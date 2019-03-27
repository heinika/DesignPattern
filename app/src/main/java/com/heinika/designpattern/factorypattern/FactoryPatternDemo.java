package com.heinika.designpattern.factorypattern;

public class FactoryPatternDemo {
    public void main(){
        Circle circle = (Circle) SharpFactory.getSharp("Circle");
        Square square = (Square) SharpFactory.getSharp("Square");
        Rectangle rectangle = (Rectangle) SharpFactory.getSharp("Rectangle");
        circle.draw();
        square.draw();
        rectangle.draw();
    }
}
