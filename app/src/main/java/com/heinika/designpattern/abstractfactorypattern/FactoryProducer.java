package com.heinika.designpattern.abstractfactorypattern;

import java.lang.reflect.InvocationTargetException;

public class FactoryProducer {
    public AbstractFactory getFactory(String factoryClassName){
        try {
            String FACTORY_PACKAGE = "com.heinika.designpattern.abstractfactorypattern.";
            Class c = Class.forName(FACTORY_PACKAGE +  factoryClassName);
            return (AbstractFactory) c.getConstructor().newInstance();
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
