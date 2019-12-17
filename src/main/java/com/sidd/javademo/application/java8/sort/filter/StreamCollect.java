package com.sidd.javademo.application.java8.sort.filter;

import com.sidd.javademo.application.java8.entity.Person;
import org.w3c.dom.ls.LSInput;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamCollect {
    public static void main(String args[]) {

        List<String> list = Arrays.asList("Bibin", "Ajay", "Siva");

        String result = list.parallelStream().collect(StringBuilder::new,
                (response, element) -> response.append(" ").append(element),
                (response1, response2) -> response1.append(",").append(response2.toString()))
                .toString();

        System.out.println("Result: "+result);

        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9);

        IntSummaryStatistics statistics = intList.stream().collect(Collectors.summarizingInt(i->i+i));
        System.out.println("Sum :"+statistics.getSum());

        //Stream.collect() with Collectors.joining()
        List<String> stringList = Arrays.asList("Ram","Shyam","Shiv","Mahesh");
        String resultString = stringList.stream().collect(Collectors.joining(","));
        System.out.println("Joining Result: "+ resultString);

        //Stream.collect() with Collectors.averagingInt()
        double avg = intList.stream().collect(Collectors.averagingInt(v -> v*2));
        System.out.println("Average Result: "+ avg);

        //Stream.collect() with Collectors.counting()
        long count = intList.stream().collect(Collectors.counting());
        System.out.println("Count : "+count);

        //Stream.collect() with Collectors.toList()
        String[] strArray = {"AA", "BB", "CC"};
        List<String> strList = Arrays.stream(strArray).collect(Collectors.toList());
        strList.forEach(e -> System.out.println(e));

        //Stream.collect() with Collectors.toMap()
        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person(0001,"ajay"));
        personsList.add(new Person(0002,"Bibin"));
        personsList.add(new Person(0004,"Siva"));

        Map<Integer, String> personsMap = personsList.stream()
                .collect(Collectors.toMap(Person::getId, Person::getName));
        personsMap.forEach((x,y) -> System.out.println("Key : "+ x + " Value :"+y));







    }
}
