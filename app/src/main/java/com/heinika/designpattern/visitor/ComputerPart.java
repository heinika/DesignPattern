package com.heinika.designpattern.visitor;

public interface ComputerPart {
   void accept(ComputerPartVisitor computerPartVisitor);
}