package com.sidd.javademo.application.datastructure.stack.linkedstack.generics;

public class Stack<T> {

    private Node<T> head;
    private int count;

    //O(1)
    public void push(T data) {
        count++;
        if(head == null) {
            head = new Node<>(data);
        } else {
            Node<T> oldHeadNode = head;
            head = new Node<>(data);
            head.setNextNode(oldHeadNode);
        }
    }

    //Remove the last item we have inserted O(1)
    public T pop() {
        if(isEmpty()) return null;

        T item = head.getData();
        head = head.getNextNode();
        count--;
        return item;
    }
    //O(1)
    public int Size() {
        return count;
    }
    //O(1)
    public boolean isEmpty() {
        return count == 0;
    }

}
