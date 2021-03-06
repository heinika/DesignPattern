package com.heinika.designpattern.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ShapeFactory {
    private static final String shape_PACKAGE = "com.heinika.designpattern.factorypattern.";
    public static Shape getshape(String className){
        className = shape_PACKAGE + className;
        try {
            Class c = Class.forName(className);
            Constructor constructor = c.getConstructor();
            return (Shape) constructor.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
