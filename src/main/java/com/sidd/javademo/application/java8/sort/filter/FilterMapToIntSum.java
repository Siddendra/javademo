package com.sidd.javademo.application.java8.sort.filter;

import com.sidd.javademo.application.java8.entity.User;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Here we will filter our list for a range of given user id and
 * then we will calculate the sum of age of the users.
 */
public class FilterMapToIntSum {
    public static void main(String args[]) {
        List<User> users = User.getUsers();

        int sum = users.stream().filter(u -> u.getId() >= 2 && u.getId() <= 4)
                .mapToInt(u -> u.getAge()).sum();

        System.out.println("Sum : "+sum);

        //Here we are filtering a list and then counting the number of elements.
        long count = users.stream().filter(u -> u.getName().endsWith("sh")).collect(Collectors.counting());
        System.out.println("Count ends with sh: "+count);
    }
}
