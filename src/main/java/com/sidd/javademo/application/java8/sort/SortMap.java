package com.sidd.javademo.application.java8.sort;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortMap {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<>();
        map.put(15, "Mahesh");
        map.put(16, "Giri");
        map.put(10, "Suresh");
        map.put(30, "Nilesh");

        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(e -> System.out.println("Key: " + e.getKey() + " Value :" + e.getValue()));

        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(e -> System.out.println("Key: " + e.getKey() + " Value :" + e.getValue()));
    }

}
