package com.sidd.javademo.application.java8.entity;

import java.util.Objects;

public class Book {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        final Book book = (Book) obj;
        return name.equals(book.name) && price == book.price;
    }

    @Override
    public int hashCode() {
        int hashno =7;
        hashno = 13 * hashno + (name == null ? 0 : name.hashCode());
        return hashno;
    }
}
