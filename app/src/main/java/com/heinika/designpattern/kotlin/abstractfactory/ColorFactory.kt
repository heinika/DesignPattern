package com.heinika.designpattern.kotlin.abstractfactory

class ColorFactory : AbstractFactory() {
    override fun <T : Sharp> getSharp(clazz: Class<T>): Sharp? {
        return null
    }

    override fun <T : Color> getColor(clazz: Class<T>): Color? {
        return clazz.getDeclaredConstructor().newInstance()
    }
}