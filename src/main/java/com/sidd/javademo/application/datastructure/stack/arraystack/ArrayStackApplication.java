package com.sidd.javademo.application.datastructure.stack.arraystack;

import com.sidd.javademo.application.datastructure.list.domain.Employee;
import com.sidd.javademo.application.datastructure.stack.arraystack.ArrayStack;

public class ArrayStackApplication {

    public static void main(String args[]) {
        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

        System.out.println(stack.peek());

        System.out.println("Poped : "+ stack.pop());
        stack.printStack();

    }

}
