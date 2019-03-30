package com.heinika.designpattern.abstractfactory.color;

import static java.lang.System.out;

public class Blue implements Color {
    @Override
    public void fill() {
        out.println("fill Blue");
    }
}
