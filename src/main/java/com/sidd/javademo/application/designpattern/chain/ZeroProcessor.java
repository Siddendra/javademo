package com.sidd.javademo.application.designpattern.chain;

public class ZeroProcessor implements Chain{

    private Chain nextChain;

    @Override
    public void setNext(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void process(Number request) {
        if(request.getNumber() == 0) {
            System.out.println("ZeroProcessor : "+ request.getNumber());
        } else {
            nextChain.process(request);
        }

    }
}
