package com.sidd.javademo.application.designpattern.singleton;

//Also called Double check Locking in singleton, it ensure that only one instance of the class is created
// even in multi-thread environment
public class SingletonThreadSafe {

    private static volatile SingletonThreadSafe uniqueInstance;

    private SingletonThreadSafe() {

    }
    public static SingletonThreadSafe getInstance() {
        if(uniqueInstance == null) {
            synchronized (SingletonThreadSafe.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new SingletonThreadSafe();
                }
            }
        }
        return uniqueInstance;
    }

}
