package com.heinika.designpattern.kotlin.abstractfactory

class ShapeFactory : AbstractFactory() {
    override fun <T : Shape> getShape(clazz: Class<T>): Shape? {
        return clazz.getDeclaredConstructor().newInstance();
    }

    override fun <T : Color> getColor(clazz: Class<T>): Color? {
        return null
    }

}