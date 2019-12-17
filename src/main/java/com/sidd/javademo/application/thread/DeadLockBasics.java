package com.sidd.javademo.application.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockBasics {
    private Lock lockA = new ReentrantLock();
    private Lock lockB = new ReentrantLock();

    private void exceute() {
        new Thread(this::processThis).start();
        new Thread(this::processThat).start();
    }

    public void processThis() {
        lockA.lock();
        //process resource A
        lockB.lock();
        //Process resource B

        lockA.unlock();
        lockB.unlock();
    }

    public void processThat() {
        lockB.lock();
        //process resource B
        lockA.lock();
        //process resource A

        lockA.unlock();
        lockB.unlock();

    }
}
