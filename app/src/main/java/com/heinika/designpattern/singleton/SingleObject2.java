package com.heinika.designpattern.singleton;


class SingleObject2 {
    private static SingleObject2 instance;

    private SingleObject2(){}

    static SingleObject2 getInstance(){
        if(instance == null){
            instance = new SingleObject2();
        }
        return instance;
    }

    void showMessage(){
        System.out.println("Hello World!");
    }
}
