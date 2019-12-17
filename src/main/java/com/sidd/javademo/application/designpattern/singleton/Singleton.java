package com.sidd.javademo.application.designpattern.singleton;

//Class can be made singleton vy two simple steps
//1. Make constructor private
//2. provide static method by providing only one instance.

//This implementation will break in multi-thread environment.
public class Singleton {

    private static Singleton uniqueInstance;
    //private Constructor
    private Singleton() {

    }

    public static Singleton getInstance() {
        if(uniqueInstance == null) {
        uniqueInstance = new Singleton();
    }
        return uniqueInstance;
    }

}
