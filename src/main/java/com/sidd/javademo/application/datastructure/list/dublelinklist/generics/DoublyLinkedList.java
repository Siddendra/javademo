package com.sidd.javademo.application.datastructure.list.dublelinklist.generics;

public class DoublyLinkedList<T extends Comparable<T>> {

    private Node<T> head;
    private Node<T> tail;

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        //This is the first item in the LinkedList
        if(tail == null) {
            tail = newNode;
            head = newNode;
        } else {
            newNode.setPreviousNode(tail);
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }

    //Traverse the list in forward Manner
    public void traverse() {
        if(head == null) return;
        Node<T> actualNode = head;
        while(actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getNextNode();
        }
    }

    public void traversalBackward() {
        if(tail == null) return;
        Node<T> actualNode = tail;
        while (actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getPreviousNode();
        }
    }
}
