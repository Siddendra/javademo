package com.sidd.javademo.application.java8.entity;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.name = name;
        this.id  = id;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                age == student.age &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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

    @Override
    public int compareTo(Student student) {
        return name.compareTo(student.getName());
    }
}
