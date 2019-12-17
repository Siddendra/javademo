package com.sidd.javademo.application.programs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Simple Java program to find the factorial of a number using recursion and iteration.
 * Iteration will use for loop while recursion will call method itself
 */
public class Factorial {

    public static void main(String args[]) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter the numer : ");
        int number = scnr.nextInt();
        System.out.println("Factorial of the given number usig Resursion is :: "+ factRecursion(number));
        System.out.println("Factorial of the given number Using Iteration and loop is :: "+ factInteration(number));


    }

    private static int factInteration(int number) {
        int factnumber = 1, reminder = 0;
        while(number != 0) {
            factnumber = factnumber *number;
            number --;
        }
        return factnumber;
    }

    private static int factRecursion(int number) {

        if(number == 0) {
            return 1;
        }

        return number * factRecursion(number -1 );

    }

}
