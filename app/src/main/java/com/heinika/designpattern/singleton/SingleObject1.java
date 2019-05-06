package com.heinika.designpattern.singleton;

class SingleObject1 {
    private static SingleObject1 instance = new SingleObject1();

    private SingleObject1(){}

    static SingleObject1 getInstance(){
        return instance;
    }

    void showMessage(){
        System.out.println("Hello World!");
    }
}
