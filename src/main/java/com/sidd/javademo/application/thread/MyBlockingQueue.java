package com.sidd.javademo.application.thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<E> {
    private int max;
    private Queue<E> queue = new LinkedList<>();
    private ReentrantLock lock = new ReentrantLock();
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();

    public MyBlockingQueue(int size) {
        queue = new LinkedList<>();
        this.max = size;
    }

    public void put(E e) {
        lock.lock();
        try {
            if (queue.size() == max) {
                notFull.await();
            } else {
                queue.add(e);
                notEmpty.notify();
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public E take() {
        lock.lock();

        try {
            if (queue.size() == 0) {
                notEmpty.await();
            } else {
                E item = queue.remove();
                notFull.notify();
                return item;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return null;
    }
}
