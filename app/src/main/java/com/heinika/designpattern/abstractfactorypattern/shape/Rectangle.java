package com.heinika.designpattern.abstractfactorypattern.shape;

import static java.lang.System.out;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        out.println("draw Rectangle");
    }
}
