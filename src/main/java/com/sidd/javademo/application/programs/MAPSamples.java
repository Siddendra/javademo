package com.sidd.javademo.application.programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MAPSamples {

    public static void main(String args[]) {
        Map<String, String> sampleMap = new HashMap<>();
        sampleMap.put("hello", "good morning");
        sampleMap.put("hello", "done my work");

        System.out.println(sampleMap.get("hello"));

        HashSet<Object> sampleHashSet = new HashSet<>();
        sampleHashSet.add("hai");
        sampleHashSet.add("hai");
        String bac = "abc";
        String bac1 = "abc";


        System.out.println(sampleHashSet.size());

        sampleHashSet.forEach(i -> System.out.println(i));
        if(bac == bac1) {
            System.out.println("Strings are Equal");
        }
    }
}
