package com.sidd.javademo.application.programs;

import java.util.Scanner;

public class IntegerPalindrome {
    public static void main(String args[]) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scnr.nextInt();
        System.out.println("The Given number is Palindrome : " + ispalindrome(number));

    }


    private static boolean ispalindrome(int number) {
        int reverse = 0, remider = 0, pallendrome = number;

        while (number != 0) {
            remider = number % 10;
            reverse = reverse * 10 + remider;
            number = number / 10;
        }
        return (pallendrome == reverse);
    }

}
