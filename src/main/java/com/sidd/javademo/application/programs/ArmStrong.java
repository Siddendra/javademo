package com.sidd.javademo.application.programs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal
 * to the number itself. For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
 */
public class ArmStrong {

    private final Logger logger = LoggerFactory.getLogger(ArmStrong.class);

    public static void main(String args[]) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter the number :");
        int number = scnr.nextInt();
        System.out.println("The given number is Armstrong number ::"+ isArmstrongNum(number));

    }

        private static boolean isArmstrongNum(int number) {
            //Calling the Order function
            int n = order(number);
            int temp= number, sum= 0;
            while(temp != 0) {
                int r = temp%10;
                sum = sum + power(r, n);
                temp =temp/10;
            }
            return (sum == number);

        }

    private static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(n%2 == 0) {
            return power(x, n/2)*power(x, n/2);
        } else {
            return x * power(x, n/2)*power(x, n/2);
        }
    }

    private static int order(int number) {
        int n =0;
        while(number != 0){
            number = number/10;
            n++;
        }
        return n;
    }
}
