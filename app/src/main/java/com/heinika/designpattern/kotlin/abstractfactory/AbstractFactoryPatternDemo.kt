package com.heinika.designpattern.kotlin.abstractfactory

import com.heinika.designpattern.kotlin.abstractfactory.color.Red
import com.heinika.designpattern.kotlin.abstractfactory.sharp.Square


fun main() {
    val factory = FactoryProducer()
    val sharpFactory = factory.getFactory(SharpFactory::class.java)
    val square = sharpFactory!!.getSharp(Square::class.java)
    square!!.draw()
    val colorFactory = factory.getFactory(ColorFactory::class.java)
    val red = colorFactory!!.getColor(Red::class.java)
    red!!.fill()
}

class AbstractFactoryPatternDemo{}