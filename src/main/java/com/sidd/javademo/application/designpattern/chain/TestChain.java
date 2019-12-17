package com.sidd.javademo.application.designpattern.chain;

public class TestChain {
    public static void main(String args[]) {
        //Configure Chain of responsibility
        Chain c1 = new NegativeProcessor();
        Chain c2  =  new ZeroProcessor();
        Chain c3 = new PositiveProcessor();
        c1.setNext(c2);
        c2.setNext(c3);

        //Calling the Chain of Responsibility
        c1.process(new Number(90));
        c1.process(new Number(-50));
        c1.process(new Number(0));
    }
}
