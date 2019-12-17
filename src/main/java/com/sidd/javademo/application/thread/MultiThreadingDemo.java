package com.sidd.javademo.application.thread;

public class MultiThreadingDemo extends Thread{

    public void run() {
        System.out.println("My thread is in Running state");
    }
    public static void main(String args[]) {
        MultiThreadingDemo thread = new MultiThreadingDemo();
        thread.start();

    }

}
