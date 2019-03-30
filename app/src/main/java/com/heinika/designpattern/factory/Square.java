package com.heinika.designpattern.factory;

import static java.lang.System.out;

public class Square implements Shape {
    @Override
    public void draw() {
        out.println("draw square");
    }
}
