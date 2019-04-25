package com.heinika.designpattern.chain;

import static java.lang.System.out;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    public void write(String message) {
        out.println("Console::Logger: " + message);
    }
}
