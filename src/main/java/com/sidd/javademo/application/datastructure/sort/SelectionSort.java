package com.sidd.javademo.application.datastructure.sort;

import java.util.HashMap;
import java.util.Map;

public class SelectionSort {
    public static void main(String args[]) {


        int[] intArray = {2, -111, 4, 5, 99, 76, 99};

        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex-- ) {
            int largest =0;
            for (int i=1; i<= lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);
        }

        for (int i=0; i<intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    private static void swap(int a[], int i, int j) {
        if( i == j) {
            return;
        }
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
