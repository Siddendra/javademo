package com.sidd.javademo.application.datastructure.queue;

import com.sidd.javademo.application.datastructure.list.domain.Employee;

public class ArrayQueueuApplication {

    public static void main(String args[]) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);

        queue.printQueue();

        queue.remove();

        queue.printQueue();

    }
}
