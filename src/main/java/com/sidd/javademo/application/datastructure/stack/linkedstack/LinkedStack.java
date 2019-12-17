package com.sidd.javademo.application.datastructure.stack.linkedstack;

import com.sidd.javademo.application.datastructure.list.domain.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedStack {

    private LinkedList<Employee> stack;

    public LinkedStack() {
        stack = new LinkedList<Employee>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {

        Iterator iterator = stack.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
