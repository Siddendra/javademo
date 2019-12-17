package com.sidd.javademo.application.java8.flatmap;

import com.sidd.javademo.application.java8.entity.Book;
import com.sidd.javademo.application.java8.entity.Writer;

import java.util.Arrays;
import java.util.List;

public class FlatMapWithArrayOfObject {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book("AAA", 10), new Book("BBB", 20));
        Writer w1 = new Writer("Mohan", books);
        books = Arrays.asList(new Book("CCC", 30), new Book("DDD", 15));
        Writer w2 = new Writer("Sohan", books);
        books = Arrays.asList(new Book("EEE", 45), new Book("FFF", 25));
        Writer w3 = new Writer("Vikas", books);
        books = Arrays.asList(new Book("GGG", 5), new Book("HHH", 15));
        Writer w4 = new Writer("Ramesh", books);
        Writer[][] writerArray = {{w1, w2}, {w3, w4}};

        Book book = Arrays.stream(writerArray)
                .flatMap(row -> Arrays.stream(row))
                .flatMap(writer -> writer.getBooks().stream())
                .max(new BookComparator()).get();

        System.out.println("Name:"+book.getName()+", Price:"+ book.getPrice() );


    }
}
