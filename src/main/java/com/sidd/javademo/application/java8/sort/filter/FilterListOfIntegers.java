package com.sidd.javademo.application.java8.sort.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterListOfIntegers {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("---List with Even numbers --");

        System.out.println("---List with even Numbers---");

        List<Integer> evenList = list.stream().filter(e -> e%2 == 0)
                .collect(Collectors.toList());
        System.out.println("---List with even Numbers---");

        evenList.forEach(s -> System.out.println(s +", "));

        System.out.println("\n---List with odd Numbers---");
        List<Integer> oddList = list.stream().filter(e -> e%2 == 1)
                .collect(Collectors.toList());
        oddList.forEach(s -> System.out.println(s +", "));
    }
    }
