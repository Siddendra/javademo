package com.sidd.javademo.application.datastructure.list;

import com.sidd.javademo.application.datastructure.list.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String args[]) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Siva", "Krishna", 123));
        employeeList.add(new Employee("Ajay", "kumar", 234));
        employeeList.add(new Employee("Bibin", "Kaivathu", 897));

        employeeList.forEach(employee -> System.out.println(employee.toString()));
        employeeList.set(1, new Employee("Sid", "K", 143));

        //System.out.println(employeeList.get(1));

        Object[] employeeObjectArray = employeeList.toArray();

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee : employeeArray) {
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("Sid", "K", 143)));
        System.out.println(employeeList.indexOf(new Employee("Sid", "K", 143)));

        employeeList.remove(2);


    }
}
