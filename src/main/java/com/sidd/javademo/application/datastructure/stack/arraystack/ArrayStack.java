package com.sidd.javademo.application.datastructure.stack.arraystack;

import com.sidd.javademo.application.datastructure.list.domain.Employee;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top;

    public ArrayStack(int capasity) {
        stack = new Employee[capasity];
    }

    public void push(Employee employee) {
        if(top == stack.length) {
            //need to resize the backing Array
            Employee[] newarray = new Employee[stack.length * 2];
            System.arraycopy(stack, 0, newarray, 0, stack.length);
            stack = newarray;
        }
        stack[top++] = employee;
    }

    public Employee pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        } else {
            Employee emp = stack[--top];
            stack[top] = null;
            return emp;
        }
    }

    public Employee peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stack[top -1];
        }
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    public void printStack() {
        for(int i = top-1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

}
