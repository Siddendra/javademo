package com.sidd.javademo.application.programs;

import java.util.Scanner;

/**
 * This Program is used to display the Fibonacci numbers using the recursion and iteration.
 *
 * Fibonacci number is sum of the previous tow fibonacci numbers fn = fn-1 + fn-2
 *
 * first 10 fibonacci numbers are 1 1 2 3 5 8 13 21 34 55
 *
 * @author sidkodep
 */

public class FibonacciCalculator {

    public static void main(String args[]) {

        //input to print the fibonacci series upto how may numbers
        System.out.println("Enter the number upto which Fibonacci series to print :");
        int number = new Scanner(System.in).nextInt();

        //print the febionacci number
        for(int i=1; i<=number; i++) {
            System.out.println(fibonacci2(i) + "");
        }


    }

    private static int fibonacci2(int number) {
        if(number == 1 || number == 2) {
            return 1;
        }
        int fibo1 =1, fibo2 =1, fibonacci =1;
        for (int i=3; i <= number; i++) {

            fibonacci = fibo1 + fibo2;

            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci;
    }

    private static int fibonacci1(int number) {

        if(number ==1 || number ==2) {
            return 1;
        }
        return fibonacci1(number - 1) + fibonacci1(number - 2);

    }

    /*
     * Java Program to calculate Fibonacci numbers with memorization
     * This is quite fast as compared to previous Fibonacci function
     * especially for calculating factorial of large numbers.
     */
    /*private static int improveFibo(int number) {
        Integer fibonacci = cache.get(number);

        if(fibonacci != null) {
            return fibonacci;
        }

        fibonacci = fibonacci2(number);

        cache.put(number, fibonacci);

        return fibonacci;
    }*/

}
