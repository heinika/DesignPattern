package com.heinika.designpattern.prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Circle circle = (Circle) ShapeCache.getShape("Circle");
        Square square = (Square) ShapeCache.getShape("Square");
        Rectangle rectangle = (Rectangle) ShapeCache.getShape("Rectangle");
        circle.draw();
        square.draw();
        rectangle.draw();
    }
}
