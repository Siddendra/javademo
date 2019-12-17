package com.sidd.javademo.application.java8.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static List<User> getUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "Dinesh", 20));
        users.add(new User(2, "Kamal", 15));
        users.add(new User(3, "Vijay", 25));
        users.add(new User(4, "Ramesh", 30));
        users.add(new User(5, "Mahesh", 18));

        return users;
    }
}
