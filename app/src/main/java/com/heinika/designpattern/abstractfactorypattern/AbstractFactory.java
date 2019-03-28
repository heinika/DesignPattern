package com.heinika.designpattern.abstractfactorypattern;

import com.heinika.designpattern.abstractfactorypattern.color.Color;
import com.heinika.designpattern.abstractfactorypattern.shape.Shape;

public abstract class AbstractFactory {
    abstract Shape getShape(String shapeClassName);
    abstract Color getColor(String colorClassName);
}
