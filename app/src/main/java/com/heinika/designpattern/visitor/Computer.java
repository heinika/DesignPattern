package com.heinika.designpattern.visitor;

public class Computer implements ComputerPart {
   
   private ComputerPart[] parts;
 
   Computer(){
      parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};      
   } 
 
 
   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      for (ComputerPart part : parts) {
         part.accept(computerPartVisitor);
      }
      computerPartVisitor.visit(this);
   }
}