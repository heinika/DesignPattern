package com.heinika.designpattern.kotlin.abstractfactory

class ColorFactory : AbstractFactory() {
    override fun <T : Shape> getShape(clazz: Class<T>): Shape? {
        return null
    }

    override fun <T : Color> getColor(clazz: Class<T>): Color? {
        return clazz.getDeclaredConstructor().newInstance()
    }
}