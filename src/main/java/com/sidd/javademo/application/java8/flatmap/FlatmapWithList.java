package com.sidd.javademo.application.java8.flatmap;

import com.sidd.javademo.application.java8.entity.Book;
import com.sidd.javademo.application.java8.entity.Writer;

import java.util.Arrays;
import java.util.List;

public class FlatmapWithList {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book("AAA", 10), new Book("BBB", 20));
        Writer w1 = new Writer("Mohan", books);
        books = Arrays.asList(new Book("XXX", 30), new Book("ZZZ", 15));
        Writer w2 = new Writer("Sohan", books);
        List<Writer> writers = Arrays.asList(w1, w2);

       Book maxBook = writers.stream().flatMap(writer -> writer.getBooks().stream())
                .max(new BookComparator()).get();
    }
}
