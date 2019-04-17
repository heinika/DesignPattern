package com.heinika.designpattern.bridge;

public class Circle extends Shape {
    private int x;
    private int y;
    private int radius;

    @Override
    public void draw() {
        drawApi.drawCircle(radius,x,y);
    }

    public Circle(int x,int y,int radius,DrawApi drawApi){
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.drawApi = drawApi;
    }
}
