package com.heinika.designpattern.kotlin.abstractfactory

abstract class AbstractFactory {
    abstract fun <T : Shape> getShape(clazz: Class<T>): Shape?
    abstract fun <T : Color> getColor(clazz: Class<T>): Color?
}