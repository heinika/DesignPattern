package com.heinika.designpattern.builder;

public abstract class Burger implements Item {
    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    abstract public float price();
}
