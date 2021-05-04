package com.sidd.javademo.application.datastructure.list.generics;

public interface List<T> {
    public void insert(T data);
    public void remove(T data);
    public void traverse();
    public int size();
}
