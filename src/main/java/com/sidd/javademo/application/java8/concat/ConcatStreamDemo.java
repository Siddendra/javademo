package com.sidd.javademo.application.java8.concat;

import java.util.stream.Stream;

public class ConcatStreamDemo {
    public static void main(String args[]) {
        Stream<String> s1 = Stream.of("AA","BB", "CC");
        Stream<String> s2 = Stream.of("AA","BB", "DD");
        Stream<String> s = Stream.concat(s1, s2);
        s.forEach(e->System.out.print(e+ " "));

        //Removing duplicates using distinct

        System.out.println("\n Removing the duplicate elements using the distinct");
        s1 = Stream.of("AA", "BB", "CC");
        s2 = Stream.of("AA", "BB", "DD");
        s = Stream.concat(s1, s2).distinct();
        s.forEach(e->System.out.print(e+" "));


     }
}
