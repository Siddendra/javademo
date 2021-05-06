package com.sidd.javademo.application.datastructure.stack.arraystack.generics;

public class Stack<T>{

    private int count;
    private T[] stack;

    public Stack() {
        stack = (T[]) new Object[1];
    }

    //We have to add the item to end of the array O(1)
    public void push(T newData) {
        // Arrays are not Dynamic Data structures
        // We have to resize the underlying array if needed
        // If there are too  many items : we double the size of the array
        // If there are too few items : then we decrease the array size
        if(count == stack.length) {
            reSize(2*count);
        }
        stack[count++] = newData;

    }

    // this is the bottleneck of the application O(N)
    private void reSize(int capacity) {

        System.out.println("Need to resize the array");
        T[] stackCopy = (T[]) new Object[capacity];

        //Copy the items one by one
        for(int i=0; i<count; i++)
            stackCopy[i] = stack[i];

        stack = stackCopy;
    }

    public T pop() {
        if(isEmpty()) return null;

        T item = stack[--count];

        //obsolete references - avoid memory leaks
        stack[count] = null;

        // May be we have to resize the array and decrease the size
        // stack is 25% full
        if(count > 0 && count == stack.length / 4) {
            reSize(stack.length/2);
        }
        return item;

    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}
