package com.sidd.javademo.application.datastructure.list.generics;

public interface List<T extends Comparable<T>> {
    public Node<T> getMiddleNode();
    public void reverse();
    public void insert(T data);
    public void remove(T data);
    public void traverse();
    public int size();
}
