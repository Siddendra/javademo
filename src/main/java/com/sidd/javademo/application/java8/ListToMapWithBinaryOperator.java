package com.sidd.javademo.application.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;
public class ListToMapWithBinaryOperator {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(100, "Mohan"));
        list.add(new Person(100, "Sohan"));
        list.add(new Person(300, "Mahesh"));
        /*Map<Integer, List<Person>> map = list.stream()
                .collect(Collectors.toMap(Person::getId, Person::getName, (x, y) -> x+", "+ y));*/

        Map<Integer, List<Person>> personMap;
       // personMap = list.stream().collect(Collectors.groupingBy(Person::getId,Collectors.mapping(p ->p,Collectors.toList())));

        personMap = list.stream().collect(Collectors.groupingBy(e->e.getId()));

        personMap.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));

        Callable<BigDecimal> calculateTax = new Callable<BigDecimal>() {
            @Override
            public BigDecimal call() throws Exception {
                return null;
            }
        };
    }
}

 class Person {
    private Integer id;
    private String name;
    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}