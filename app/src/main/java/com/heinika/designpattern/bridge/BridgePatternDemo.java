package com.heinika.designpattern.bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(10,10,5,new RedCircle());
        Shape greenCircle = new Circle(10,10,5,new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
