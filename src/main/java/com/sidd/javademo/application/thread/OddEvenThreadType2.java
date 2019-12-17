package com.sidd.javademo.application.thread;

/**
 * We’re going to have a look at how we can print even and odd numbers using two threads.
 *
 * The goal is to print the numbers in order, while one thread only prints the even numbers and the other thread
 * only prints the odd numbers. We’ll be using the concepts of thread synchronization and inter-thread communication
 * to solve the problem.
 */
public class OddEvenThreadType2 {

    public static void main(String[] args) {

        Printer printer = new Printer();

        TaskEvenOdd r1 = new TaskEvenOdd(true, printer, 10);// isOdd = true
        Thread t1 = new Thread(r1);
        TaskEvenOdd r2 = new TaskEvenOdd(false, printer, 10);// isOdd = false
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}

class Printer {
    private Object lock = new Object();
    private volatile boolean isOdd = false;

    public void printEven(int number) throws InterruptedException {
        synchronized (lock) {
            while (isOdd == false) {
                lock.wait();
            }
            System.out.println("even : " + number);
            isOdd = false;
            lock.notifyAll();
        }
    }

    public void printOdd(int number) throws InterruptedException {
        synchronized (lock) {
            while (isOdd == true) {
                lock.wait();
            }
            System.out.println("odd : " + number);
            isOdd = true;
            lock.notifyAll();
        }
    }
}

class TaskEvenOdd implements Runnable {

    private boolean isOdd;
    Printer printer;
    private int max;

    TaskEvenOdd(boolean isOdd, Printer printer, int max) {
        this.isOdd = isOdd;
        this.printer = printer;
        this.max = max;
    }

    public void run() {
        int number = isOdd == true ? 1 : 2;
        while (number <= max) {
            if (isOdd) {
                try {
                    printer.printOdd(number);
                } catch (InterruptedException e) {
                }
            } else {
                try {
                    printer.printEven(number);
                } catch (InterruptedException e) {
                }
            }
            number += 2;
        }
    }

}
