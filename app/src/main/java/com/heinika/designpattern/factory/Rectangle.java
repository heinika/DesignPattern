package com.heinika.designpattern.factory;

import static java.lang.System.out;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        out.println("draw rectangle");
    }
}
