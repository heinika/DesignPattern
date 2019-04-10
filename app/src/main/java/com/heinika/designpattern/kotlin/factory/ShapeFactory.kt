package com.heinika.designpattern.kotlin.factory

import java.lang.Exception

class SharpFactory {
    fun getShape(sharpName: String): Shape? {
        try {
            val c = Class.forName("com.heinika.designpattern.kotlin.factory.$sharpName")
            return c.getDeclaredConstructor().newInstance() as Shape
        }catch (e : Exception){
            return null
        }

    }
}