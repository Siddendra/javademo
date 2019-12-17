package com.sidd.javademo.application.programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scnr.nextLine();

        System.out.println("The given string is a pallendrome ::"+ isPallendrome(str));
        scnr.close();
    }

    private static boolean isPallendrome(String str) {
        if(str == null || str.isEmpty()) {
            return false;
        }

        char[] array = str.toCharArray();
        StringBuilder sb = new StringBuilder(str.length());
         for (int i= str.length()-1; i >= 0; i --) {
             sb.append(array[i]);
         }
         String reverseString = sb.toString();
        return str.equals(reverseString);

    }
}
