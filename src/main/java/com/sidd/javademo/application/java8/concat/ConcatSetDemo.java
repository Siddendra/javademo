package com.sidd.javademo.application.java8.concat;

import com.sidd.javademo.application.java8.entity.Book;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatSetDemo {

    public static void main(String args[]) {

        Set<Book> set1 = new HashSet<>();
        Set<Book> set2 = new HashSet<>();

        set1.add(new Book("Core java", 999));
        set1.add(new Book("Spring MVC", 299));
        set1.add(new Book("Java Memory", 399));

        set2.add(new Book("Core java", 999));
        set2.add(new Book("Spring MVC", 299));
        set2.add(new Book("Hibernate", 499));

        Set<Book> sets = Stream.concat(set1.stream(), set2.stream()).collect(Collectors.toSet());

       sets.forEach(b -> System.out.println(b.getName()+", "+b.getPrice()));


    }
}
