package com.heinika.designpattern.kotlin.abstractfactory

import com.heinika.designpattern.kotlin.abstractfactory.color.Red
import com.heinika.designpattern.kotlin.abstractfactory.shape.Square


fun main() {
    val factory = FactoryProducer()
    val shapeFactory = factory.getFactory(ShapeFactory::class.java)
    val square = shapeFactory!!.getShape(Square::class.java)
    square!!.draw()
    val colorFactory = factory.getFactory(ColorFactory::class.java)
    val red = colorFactory!!.getColor(Red::class.java)
    red!!.fill()
}

class AbstractFactoryPatternDemo{}