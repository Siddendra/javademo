package com.sidd.javademo.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Palindrome {
    private static final Logger logger = LoggerFactory.getLogger(Palindrome.class);

    static boolean isPalindrome(String str) {
        logger.info("isPallendrome method started");
        if(str == null || str.isEmpty()) {
            return false;
        }

        char[] array = str.toCharArray();
        StringBuilder sb = new StringBuilder(str.length());
         for (int i= str.length()-1; i >= 0; i --) {
             sb.append(array[i]);
         }
         String reverseString = sb.toString();
        return str.equalsIgnoreCase(reverseString);

    }

    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        logger.info("Please enter the string : ");
        String str = scnr.nextLine();
        Palindrome palindrome = new Palindrome();
        logger.info("The Given number is a pallendrome : "+palindrome.isPalindrome(str));
        //System.out.println("The given string is a pallendrome ::"+ isPallendrome(str));
        scnr.close();
    }

}
