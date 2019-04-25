package com.heinika.designpattern.command;

import static java.lang.System.out;

public class BuyStock implements Order {
    private Stock googleStock;

    public BuyStock(Stock abcStock){
        this.googleStock = abcStock;
    }

    @Override
    public void execute() {
        googleStock.buy();
    }
}
