package com.sidd.javademo.application.java8.concat;

import com.sidd.javademo.application.java8.entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatListDemo {

    public static void main(String args[]) {
        List<Book> list1 =  new ArrayList<>();
        List<Book> list2 = new ArrayList<>();

        list1.add(new Book("Core Java", 899));
        list1.add(new Book("Spring MVC", 999));
        list1.add(new Book("Java memory",  1999));

        list2.add(new Book("Core Java", 899));
        list2.add(new Book("Spring MVC", 999));
        list2.add(new Book("hibernate", 2000));

        List<Book> result = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());

        result.forEach(e->System.out.println(e.getName()+ ","+ e.getPrice()));

        System.out.println("Removing the distinct elements");

        List<Book> result1 = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());

        result1.forEach(b -> System.out.println(b.getName()+", "+ b.getPrice()));

    }
}
