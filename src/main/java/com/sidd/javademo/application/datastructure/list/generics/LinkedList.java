package com.sidd.javademo.application.datastructure.list.generics;

public class LinkedList<T extends Comparable<T>> implements List<T>{

    private Node<T> root;
    private int numberOfItems;

    @Override
    public void insert(T data) {
        if(root == null) {
            //This is the first item in the linked list
            root = new Node<>(data);
        } else {
            insertBeginning(data);
        }
    }

    private void insertBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        root = newNode;
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
        if(root == null) return;
        //We want to remove the first node
        if(root.getData().compareTo(data) == 0) {
            root = root.getNextNode();
        } else {
            remove(data, root, root.getNextNode());
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
       if(root == null) return;
       Node<T>  actualNode =root;
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
