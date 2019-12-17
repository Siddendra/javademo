package com.sidd.javademo.application.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamCollect {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        //Summing the collected elements
        System.out.println(list.stream().collect(Collectors.summingInt(i->i)));

        //It returns the number of elements in stream.
        Predicate<Integer> p = num -> num % 2 == 0;
        System.out.println(list.stream().filter(p).count());

        System.out.println(list.stream().findAny());
        System.out.println(list.stream().findFirst());

        //FlatMap
        Integer[][] data = {{1,2},{4,5}, {6,7}};

        List<Integer> flatList = Arrays.stream(data)
                .flatMap(row -> Arrays.stream(row))
                .filter(num -> num%2 ==1)
                .collect(Collectors.toList());

        flatList.forEach(e->System.out.print(e+" ,"));






}
}
