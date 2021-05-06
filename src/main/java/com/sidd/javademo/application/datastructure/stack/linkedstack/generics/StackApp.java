package com.sidd.javademo.application.datastructure.stack.linkedstack.generics;

public class StackApp {
    public static void main(String args[]) {
        Stack<String> names = new Stack<>();
        names.push("Adam");
        names.push("Kevin");
        names.push("Vikram");

        while (!names.isEmpty()) {
            System.out.println(names.pop());
        }
    }
}
