package com.sidd.javademo.application.datastructure.list.dublelinklist;

import com.sidd.javademo.application.datastructure.list.domain.Employee;

public class DoubleLikedListExample {

    public static void main(String args[]) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeDoubleLinkedList list = new EmployeeDoubleLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());

        list.printList();

        Employee billEnd = new Employee("Bill", "End", 89);
        list.addToEnd(billEnd);

        System.out.println(list.getSize());

        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

        list.removeFromEnd();
        System.out.println(list.getSize());
        list.printList();




    }
}
