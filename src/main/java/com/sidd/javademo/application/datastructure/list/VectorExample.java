package com.sidd.javademo.application.datastructure.list;

import com.sidd.javademo.application.datastructure.list.domain.Employee;

import java.util.List;
import java.util.Vector;

public class VectorExample {

    public static void main(String args[]) {

        List<Employee> employeeList = new Vector<>();
        //public synchronized boolean add(E e) {
        employeeList.add(new Employee("hello", "hi", 123));
    }
}
