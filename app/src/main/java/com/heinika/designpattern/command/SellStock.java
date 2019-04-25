package com.heinika.designpattern.command;

public class SellStock implements Order {
   private Stock googleStock;
 
   public SellStock(Stock abcStock){
      this.googleStock = abcStock;
   }
 
   public void execute() {
      googleStock.sell();
   }
}