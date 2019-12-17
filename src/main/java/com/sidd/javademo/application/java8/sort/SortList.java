package com.sidd.javademo.application.java8.sort;

import com.sidd.javademo.application.java8.entity.Student;
import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

    public static void main(String args[]) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(1, "Mahesh", 12));
        studentList.add(new Student(2, "Suresh", 15));
        studentList.add(new Student(3, "Nilesh", 10));

        System.out.println("----Natural Sorting by Name");

        List<Student> sortedList = studentList.stream().sorted().collect(Collectors.toList());
        //sortedList.forEach(e->System.out.println("Id:"+e.getId()+", Name:"+e.getName()+", Age:"+e.getAge()));

        System.out.println("----Natural Sorting by Name in reverse Order");

        //sortedList = studentList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        //sortedList.forEach(e-> System.out.println("Id:"+e.getId()+", Name:"+e.getName()+", Age:"+e.getAge()));

        System.out.println("---Sorting using Comparator by Age---");

        sortedList = studentList.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());

        sortedList.forEach(e-> System.out.println("Id:"+e.getId()+", Name:"+e.getName()+", Age:"+e.getAge()));

        System.out.println("----Sorting using the Comparator by Age in reverse  Oder----");

        sortedList = studentList.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());

        sortedList.forEach(e-> System.out.println("Id:"+e.getId()+", Name:"+e.getName()+", Age:"+e.getAge()));
     }



}
