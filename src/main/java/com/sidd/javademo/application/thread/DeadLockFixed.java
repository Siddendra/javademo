package com.sidd.javademo.application.thread;

public class DeadLockFixed {

    /** * Both method are now requesting lock in same order, first Integer and then String.
    * You could have also done reverse e.g. first String and then Integer,
    * both will solve the problem, as long as both method are requesting lock in consistent order. */
    public void method1() {
        synchronized (Integer.class) {
            System.out.println("Aquired lock on the Integer.class object");

            synchronized (String.class) {
                System.out.print("Aquired lock on the Strig.class object");
            }

        }
    }

    public void method2() {

        synchronized (Integer.class) {
            System.out.print("Aquired lock on the Integer.class object");

            synchronized (String.class) {
                System.out.println("Aquired lock on the String.class object.");
            }
        }

    }



}
