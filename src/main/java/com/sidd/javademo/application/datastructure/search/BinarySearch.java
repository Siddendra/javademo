package com.sidd.javademo.application.datastructure.search;

public class BinarySearch {

    public static void main(String args[]) {
        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};

       /* System.out.println(iterativeBinarySearch(intArray, -15));
        System.out.println(iterativeBinarySearch(intArray, 35));*/

        System.out.println(recursiveBinarySearch(intArray, -15));
        System.out.println(recursiveBinarySearch(intArray, 35));

    }

    public static int iterativeBinarySearch(int a[], int value) {
        int start = 0;
        int end = a.length;
        while (start < end) {
            int midpoint = (start + end) / 2;
            if (a[midpoint] == value) {
                return midpoint;
            } else if (a[midpoint] < value) {
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        }

        return -1;
    }

    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    private static int recursiveBinarySearch(int[] input, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }
        int midpoint = (start + end) / 2;

        if (input[midpoint] == value) {
            return midpoint;
        } else if (input[midpoint] < value) {
            return recursiveBinarySearch(input, midpoint + 1, end, value);
        } else {
            return recursiveBinarySearch(input, start, midpoint, value);
        }

    }

}
