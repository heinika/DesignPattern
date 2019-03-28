package com.heinika.designpattern.abstractfactorypattern.color;

import static java.lang.System.out;

public class Blue implements Color {
    @Override
    public void fill() {
        out.println("fill Blue");
    }
}
