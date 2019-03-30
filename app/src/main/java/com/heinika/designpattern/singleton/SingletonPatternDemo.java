package com.heinika.designpattern.singleton;

public class SingletonPatternDemo {
    public void main(){
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
