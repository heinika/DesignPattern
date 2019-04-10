package com.heinika.designpattern.kotlin.abstractfactory

import java.lang.Exception

class FactoryProducer {
    fun <T : AbstractFactory> getFactory(c: Class<T>): AbstractFactory? {
        try {
            return c.getDeclaredConstructor().newInstance()
        } catch (e: Exception) {
            return null
        }
    }
}