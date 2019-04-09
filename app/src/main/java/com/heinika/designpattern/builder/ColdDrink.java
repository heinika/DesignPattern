package com.heinika.designpattern.builder;

public abstract class ColdDrink implements Item {
    @Override
    abstract public String name();

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    abstract public float price();
}
