package com.heinika.designpattern.abstractfactorypattern.color;

import static java.lang.System.out;

public class Green implements Color {
    @Override
    public void fill() {
        out.println("fill Green");
    }
}
