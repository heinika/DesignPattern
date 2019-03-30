package com.heinika.designpattern.abstractfactory.color;

import static java.lang.System.out;

public class Red implements Color {
    @Override
    public void fill() {
        out.println("fill Red");
    }
}
