package com.sidd.javademo.application.datastructure.queue.generics;

public class QueueApp {

    public static void main(String args[]) {

        Queue<Integer> myQueue = new Queue<Integer>();

        myQueue.enQueue(14);

        System.out.println("Size ::"+myQueue.size());
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
    }
}
