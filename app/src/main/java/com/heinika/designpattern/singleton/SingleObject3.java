package com.heinika.designpattern.singleton;


class SingleObject3 {
    private static SingleObject3 instance;

    private SingleObject3(){}

    static synchronized SingleObject3 getInstance(){
        if(instance == null){
            instance = new SingleObject3();
        }
        return instance;
    }

    void showMessage(){
        System.out.println("Hello World!");
    }
}
