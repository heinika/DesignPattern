package com.heinika.designpattern.kotlin.factory

fun main(args: Array<String>){
    val square = shapeFactory().getShape("Square")
    val circle = shapeFactory().getShape("Circle")
    val rectangle = shapeFactory().getShape("Rectangle")
    square!!.draw()
    circle!!.draw()
    rectangle!!.draw()
}

class FactoryPatternDemo{}