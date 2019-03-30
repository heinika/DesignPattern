package com.heinika.designpattern.abstractfactory;

import com.heinika.designpattern.abstractfactory.color.Color;
import com.heinika.designpattern.abstractfactory.shape.Shape;

public abstract class AbstractFactory {
    abstract Shape getShape(String shapeClassName);
    abstract Color getColor(String colorClassName);
}
