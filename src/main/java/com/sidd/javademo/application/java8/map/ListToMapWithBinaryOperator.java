package com.sidd.javademo.application.java8.map;

import com.sidd.javademo.application.java8.entity.Person;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class ListToMapWithBinaryOperator {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(100, "Mohan"));
        list.add(new Person(100, "Sohan"));
        list.add(new Person(300, "Mahesh"));

        Map<Integer, String> map = list.stream()
                .collect(Collectors.toMap(Person::getId, Person::getName, (x, y) -> x+", "+y));
        map.forEach((x,y) -> System.out.println("Key :"+ x+ "Value :"+y));

        //List to Map with Key Mapper, Value Mapper, Merge Function and Map Supplier

        LinkedHashMap<Integer, String> linkedHashMap =
                list.stream()
                        .collect(Collectors.toMap(Person::getId, Person::getName, (x,y) -> x+", "+y , LinkedHashMap::new));

    }
}
