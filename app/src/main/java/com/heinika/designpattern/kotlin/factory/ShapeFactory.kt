package com.heinika.designpattern.kotlin.factory

import java.lang.Exception

class ShapeFactory {
    fun getShape(shapeName: String): Shape? {
        try {
            val c = Class.forName("com.heinika.designpattern.kotlin.factory.$shapeName")
            return c.getDeclaredConstructor().newInstance() as Shape
        }catch (e : Exception){
            return null
        }

    }
}