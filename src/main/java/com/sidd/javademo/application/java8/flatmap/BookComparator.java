package com.sidd.javademo.application.java8.flatmap;

import com.sidd.javademo.application.java8.entity.Book;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        if (b1.getPrice() > b2.getPrice()) {
            return 1;
        } else if (b1.getPrice() == b2.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }
}
