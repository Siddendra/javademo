package com.sidd.javademo.application.programs;

import java.util.Arrays;

/**
 * This Program is use to implement the myArray List
 */
public class MyArrayList<E> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if(size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if(i >= size && i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index :"+i+" Size:"+ i);
        }
        return (E)elements[i];

    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

}
