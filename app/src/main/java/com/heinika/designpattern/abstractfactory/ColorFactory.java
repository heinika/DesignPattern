package com.heinika.designpattern.abstractfactory;

import com.heinika.designpattern.abstractfactory.color.Color;
import com.heinika.designpattern.abstractfactory.shape.Shape;

import java.lang.reflect.InvocationTargetException;

public class ColorFactory extends AbstractFactory{

    @Override
    Shape getShape(String shapeClassName) {
        return null;
    }

    @Override
    Color getColor(String colorClassName) {
        try {
            String COLOR_PACKAGE = "com.heinika.designpattern.abstractfactorypattern.color.";
            Class c = Class.forName(COLOR_PACKAGE + colorClassName);
            return (Color) c.getConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
