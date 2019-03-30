package com.heinika.designpattern.factory;

import static java.lang.System.out;

public class Circle implements Shape {
    @Override
    public void draw() {
        out.println("draw circle");
    }
}
