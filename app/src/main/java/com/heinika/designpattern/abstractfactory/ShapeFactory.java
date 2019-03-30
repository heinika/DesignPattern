package com.heinika.designpattern.abstractfactory;

import com.heinika.designpattern.abstractfactory.color.Color;
import com.heinika.designpattern.abstractfactory.shape.Shape;

import java.lang.reflect.InvocationTargetException;

public class ShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(String shapeClassName) {
        try {
            String SHAPE_PACKAGE = "com.heinika.designpattern.abstractfactorypattern.shape.";
            Class c = Class.forName(SHAPE_PACKAGE + shapeClassName);
            return (Shape) c.getConstructor().newInstance();
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

    @Override
    Color getColor(String shapeClassName) {
        return null;
    }
}
