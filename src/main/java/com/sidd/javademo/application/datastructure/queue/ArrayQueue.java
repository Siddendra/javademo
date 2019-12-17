package com.sidd.javademo.application.datastructure.queue;

import com.sidd.javademo.application.datastructure.list.domain.Employee;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        if(back == queue.length) {
            //need to resize the backing queue
            Employee[] newArray = new Employee[queue.length * 2];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }
            queue[back] = employee;
            back++;
    }

    public Employee remove() {
        if(size() == 0) {
            throw new NoSuchElementException();
        }

        Employee emp = queue[front];
        queue[front] = null;
        front++;
        if(size() == 0) {
            front = 0;
            back = 0;
        }
        return emp;
    }

    public int size() {
        return back - front;
    }

    public Employee peek() {
        if(size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public void printQueue() {
        for(int i=front; i< back; i++) {
            System.out.println(queue[i]);
        }
    }

}
