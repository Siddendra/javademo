package com.sidd.javademo.application.thread;

public class MultiThreadRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("My thread is in Running state");
    }

    public static void main(String args[]) {
        MultiThreadRunnable obj = new MultiThreadRunnable();
        Thread thread = new Thread(obj);
        thread.start();
    }
}
