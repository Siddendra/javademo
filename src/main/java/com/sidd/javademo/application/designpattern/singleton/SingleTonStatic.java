package com.sidd.javademo.application.designpattern.singleton;

public class SingleTonStatic {
    private static final SingleTonStatic uniqueInstance = new SingleTonStatic();

    private SingleTonStatic() {}

    public static SingleTonStatic getInstance() {
        return uniqueInstance;
    }
}
