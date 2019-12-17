package com.sidd.javademo.application.java8.concat;

import com.sidd.javademo.application.java8.entity.Book;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class ConcatArraysDemo {
    public static void main(String args[]) {

        Book[] books1 =  new Book[3];
        Book[] books2 = new Book[3];
        books1[0] = new Book("Core Jva", 999);
        books1[1] = new Book("Spring MVC", 3999);
        books1[2] = new Book("Hibernate" , 2999);

        books2[0] = new Book("Core Java", 999);
        books2[1] = new Book("Spring MVC", 3999);
        books2[2] =  new Book("Java Memory", 4999);

        Book[] books =(Book[]) Stream.concat(Stream.of(books1), Stream.of(books2)).toArray(b -> new Book[b]);

        for(Book b: books) {
            System.out.println(b.getName()+", "+b.getPrice());
        }

        System.out.print("Removing the duplicate elements using distinct");

        Book[] books_1 = (Book[]) Stream.concat(Stream.of(books1), Stream.of(books2)).distinct().toArray(b -> new Book[b]);

        for (Book b: books_1) {
            System.out.println(b.getName() +", "+b.getPrice());
        }

    }
}
