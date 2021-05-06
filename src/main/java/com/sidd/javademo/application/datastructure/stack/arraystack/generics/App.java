package com.sidd.javademo.application.datastructure.stack.arraystack.generics;

public class App {
    public static void main(String args[]) {
        Stack<Integer> nums =  new Stack<>();
        nums.push(1);
        nums.push(2);
        nums.push(3);
        nums.push(4);
        nums.push(5);

        while ( ! nums.isEmpty()) {
            System.out.println(nums.pop());
        }

    }
}
