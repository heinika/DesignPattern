package com.heinika.designpattern.kotlin.abstractfactory.shape

import com.heinika.designpattern.kotlin.abstractfactory.Shape

class Rectangle : Shape {
    override fun draw() {
        println("draw Rectangle")
    }

}