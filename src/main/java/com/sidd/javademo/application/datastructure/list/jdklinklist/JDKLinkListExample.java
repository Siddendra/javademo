package com.sidd.javademo.application.datastructure.list.jdklinklist;

import com.sidd.javademo.application.datastructure.list.domain.Employee;

import java.util.LinkedList;

public class JDKLinkListExample {

    public static void main(String args[]) {

    Employee janeJones = new Employee("Jane", "Jones", 123);
    Employee johnDoe = new Employee("John", "Doe", 4567);
    Employee marySmith = new Employee("Mary", "Smith", 22);
    Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
    Employee billEnd = new Employee("Bill", "End", 78);

    LinkedList<Employee> list = new LinkedList<>();

        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);
        list.add(billEnd); //It will add the element in  the End of the list.

        list.remove(); // Retrieves and removes the head (first element) of this list.
        list.removeLast();

        for(Employee employee : list) {
            System.out.println(employee);
        }



}


}
