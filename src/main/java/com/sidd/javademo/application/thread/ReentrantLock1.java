package com.sidd.javademo.application.thread;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock1 {

    private static Lock lock = new ReentrantLock();
    private static Condition added = lock.newCondition();
    private static Condition removed = lock.newCondition();

    private static Queue<Integer> queue = new LinkedList<>() ;
    private static int maxQueueSize = 10;

    private static int consumer_wait_time = 00;
    private static int producer_wait_time = 300;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> producer(0));
        Thread t2 = new Thread(() -> consumer());

        t1.start();
        t2.start();
    for (int i=0; i< 10; i++) {
        producer(i);
    }

    }

    private static void producer(int i) {
           lock.lock();
           try {
               while (queue.size() == maxQueueSize)
                   removed.await();
               queue.add(i);
               added.signal();

           } catch (InterruptedException e) {
               e.printStackTrace();
           } finally {
               lock.unlock();
           }

    }

    private static void consumer() {

        lock.lock();
        try{
            while(queue.size() == 0)
                added.await();
            int data = queue.remove();
            removed.signal();
            System.out.print("The data is :"+ data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}