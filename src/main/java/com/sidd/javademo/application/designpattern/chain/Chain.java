package com.sidd.javademo.application.designpattern.chain;

public interface Chain {
    public abstract void setNext(Chain nextChain);
    public abstract void process(Number request);
}
