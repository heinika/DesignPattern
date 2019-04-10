package com.heinika.designpattern.kotlin.abstractfactory

abstract class AbstractFactory {
    abstract fun <T : Sharp> getSharp(clazz: Class<T>): Sharp?
    abstract fun <T : Color> getColor(clazz: Class<T>): Color?
}