package com.sidd.javademo.application.programs;

import java.util.Scanner;

/**
 * To check given number is prime number or not.
 */
public class PrimeNumber {
    public static void main(String args[]) {
        System.out.println("Enter the number to check : ");
        int num, i, count=0;
        Scanner scnr = new Scanner(System.in);
        num = scnr.nextInt();

        for(i=2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
            if(count == 0 ) {
                System.out.println("Number is Prime number");
            } else {
                System.out.print("Numer is not Prime");
            }
    }
}
