package com.sidd.javademo.application.java8.sort.filter;

import com.sidd.javademo.application.java8.entity.User;

import java.util.List;

public class FilterFindFirstAndForEach {
    public static void main(String args[]) {
        List<User> list = User.getUsers();
        System.out.println("Using findFirst() ---");
        User user = list.stream().filter(u -> u.getName().endsWith("sh")).findFirst().orElse(null);
        System.out.println("user :"+ user.getName()+ " "+user.getAge()+" "+user.getId());

        list.stream().filter(u -> u.getName().endsWith("sh")).forEach(u -> System.out.println(u.getName()));




    }
}
