package com.sidd.javademo.application.designpattern.chain;

public class NegativeProcessor implements Chain{

    private Chain nextChain;

    @Override
    public void setNext(Chain c) {
        this.nextChain =c;
    }

    @Override
    public void process(Number request) {

        if(request.getNumber() < 0 ){
            System.out.println("Negative Processor :"+ request.getNumber());
        } else {
            nextChain.process(request);
        }

    }
}
