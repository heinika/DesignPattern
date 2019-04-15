package com.heinika.designpattern.kotlin.factory

fun main(args: Array<String>){
    val square = ShapeFactory().getShape("Square")
    val circle = ShapeFactory().getShape("Circle")
    val rectangle = ShapeFactory().getShape("Rectangle")
    square!!.draw()
    circle!!.draw()
    rectangle!!.draw()
}

class FactoryPatternDemo{}