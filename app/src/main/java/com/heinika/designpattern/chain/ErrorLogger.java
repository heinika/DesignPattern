package com.heinika.designpattern.chain;

import static java.lang.System.out;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    public void write(String message) {
        out.println("File::Logger: " + message);
    }
}
