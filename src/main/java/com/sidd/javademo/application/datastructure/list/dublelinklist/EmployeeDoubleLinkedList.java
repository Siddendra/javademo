package com.sidd.javademo.application.datastructure.list.dublelinklist;

import com.sidd.javademo.application.datastructure.list.domain.Employee;

public class EmployeeDoubleLinkedList {
    private EmployeeDubleNode head;
    private EmployeeDubleNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeDubleNode node = new EmployeeDubleNode(employee);
        if(head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }
        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeDubleNode node =  new EmployeeDubleNode(employee);
        if(tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public EmployeeDubleNode removeFromFront() {
        if(isEmpty()) {
            return null;
        }
        EmployeeDubleNode removeNode = head;
        if(head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public  EmployeeDubleNode removeFromEnd() {
        if(isEmpty()) {
            return null;
        }
        EmployeeDubleNode removenode  = tail;
        if(tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removenode.setPrevious(null);
        return removenode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeDubleNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
