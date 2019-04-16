package com.heinika.designpattern.bridge;

public abstract class Shape {
    public DrawApi drawApi;

    public Shape(){};

    public abstract void draw();
}
