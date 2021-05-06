package com.sidd.javademo.application.datastructure.list.generics;

public class LinkedList<T extends Comparable<T>> implements List<T>{

    private Node<T> head;
    private int numberOfItems;

    //Finding the Middle Node in a linked list overview
    @Override
    public Node<T> getMiddleNode() {
        Node<T> fastPointer = this.head;
        Node<T> slowPointer = this.head;
        while (fastPointer.getNextNode() != null && fastPointer.getNextNode().getNextNode() != null) {
            fastPointer = fastPointer.getNextNode().getNextNode();
            slowPointer = slowPointer.getNextNode();
        }
        return slowPointer;
    }

    //Reverse a Linked List in-place overview
    @Override
    public void reverse() {
        Node<T> currentNode = this.head;
        Node<T> previousNode = null;
        Node<T> nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.getNextNode();
            currentNode.setNextNode(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }

        this.head =previousNode;
    }

    @Override
    public void insert(T data) {
        if(head == null) {
            //This is the first item in the linked list
            head = new Node<>(data);
        } else {
            insertBeginning(data);
        }
    }

    private void insertBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(head);
        head = newNode;
    }

    //Because we have to start with the root node
    //First we have to find the last node O(n)
    private void insertEnd(T data, Node<T> node) {
        //This is when we can looking for the last node O(N)
        if(node.getNextNode() != null) {
            insertEnd(data, node.getNextNode());
        } else {
            //We found the last node
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }

    }

    @Override
    public void remove(T data) {
        if(head == null) return;
        //We want to remove the first node
        if(head.getData().compareTo(data) == 0) {
            head = head.getNextNode();
        } else {
            remove(data, head, head.getNextNode());
        }

    }

    private void remove(T data, Node<T> previousNode, Node<T> actualNode) {
        //We have to find the node we want to remove
        while(actualNode != null) {
            //This is the node we want to remove
            if(actualNode.getData().compareTo(data) == 0) {
                numberOfItems--;
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }
            previousNode =actualNode;
            actualNode = actualNode.getNextNode();
        }

    }

    @Override
    public void traverse() {
       if(head == null) return;
       Node<T>  actualNode =head;
       while (actualNode != null) {
           System.out.println(actualNode);
           actualNode = actualNode.getNextNode();
       }

    }

    @Override
    public int size() {
        return numberOfItems;
    }
}
