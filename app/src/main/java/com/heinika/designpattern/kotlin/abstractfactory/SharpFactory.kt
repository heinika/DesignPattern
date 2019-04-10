package com.heinika.designpattern.kotlin.abstractfactory

class SharpFactory : AbstractFactory() {
    override fun <T : Sharp> getSharp(clazz: Class<T>): Sharp? {
        return clazz.getDeclaredConstructor().newInstance();
    }

    override fun <T : Color> getColor(clazz: Class<T>): Color? {
        return null
    }

}