package com.sidd.javademo.application.java8.distinct;

import com.sidd.javademo.application.java8.entity.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DistinctSimpleDemo {

    public static void main(String args[]) {
        List<String> list = Arrays.asList("AA", "BB", "CC", "DD", "AA", "AA");
        System.out.println(list.stream().distinct().count());
        System.out.println(list.stream().distinct().collect(Collectors.joining(",")));

        //In this example we have a list of user object. The class will override hashCode() and equals()
        // in order to get distinct elements.

        List<Book> booksList = new ArrayList<>();

        booksList.add(new Book("Core Java", 99));
        booksList.add(new Book("spring MVC", 999));
        booksList.add(new Book("Java memory", 899));
        booksList.add(new Book("Core Java", 999));
        booksList.add(new Book("EJB", 99));
        booksList.add(new Book("Cassandra", 2399));

        long l = booksList.stream().distinct().count();

        System.out.println("The distinct number is:"+l);
        booksList.stream().distinct().forEach(e->System.out.println(e.getName()+","+e.getPrice()));

        System.out.println(booksList.stream().filter(distinctByKey(b -> b.getName())).count());
        booksList.stream().filter(distinctByKey(b -> b.getName())).forEach(b -> System.out.println(b.getName()+", " +b.getPrice()) );

    }

    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object,Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;

    }
}
