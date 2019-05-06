package com.heinika.designpattern.singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingleObject6 singleObject6 = SingleObject6.instance;
        singleObject6.showMessage();
    }
}
