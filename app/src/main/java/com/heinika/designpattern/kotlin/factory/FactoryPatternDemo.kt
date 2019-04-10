package com.heinika.designpattern.kotlin.factory

fun main(args: Array<String>){
    val square = SharpFactory().getShape("Square")
    val circle = SharpFactory().getShape("Circle")
    val rectangle = SharpFactory().getShape("Rectangle")
    square!!.draw()
    circle!!.draw()
    rectangle!!.draw()
}

class FactoryPatternDemo{}