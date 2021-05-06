package com.sidd.javademo.application.datastructure.list.dublelinklist.generics;


import java.util.LinkedList;

public class DubllyLinkedListAPP {

    public static void main(String args[]) {

        LinkedList<String> dll = new LinkedList<>();
        dll.addLast("Daniel");
        dll.addLast("Anna");
        dll.addLast("Kevin");
        for (String name : dll) {
            System.out.println(name);
        }

        DoublyLinkedList<String> names = new DoublyLinkedList<>();
        names.insert("Addam");
        names.insert("kevin");
        names.insert("Arun");
        names.insert("Vishal");
        names.insert("Vasu");

        names.traversalBackward();
        names.traverse();
    }
}
