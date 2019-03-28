package com.heinika.designpattern.abstractfactorypattern;

import com.heinika.designpattern.abstractfactorypattern.color.Color;
import com.heinika.designpattern.abstractfactorypattern.color.Red;
import com.heinika.designpattern.abstractfactorypattern.shape.Square;

public class AbstractFactoryPatternDemo {
    public void main(){
        FactoryProducer factoryProducer = new FactoryProducer();
        ColorFactory colorFactory = (ColorFactory) factoryProducer.getFactory(ColorFactory.class.getSimpleName());
        ShapeFactory shapeFactory = (ShapeFactory) factoryProducer.getFactory(ShapeFactory.class.getSimpleName());
        Red red = (Red) colorFactory.getColor(Red.class.getSimpleName());
        red.fill();
        Square square = (Square) shapeFactory.getShape(Square.class.getSimpleName());
        square.draw();
    }
}
