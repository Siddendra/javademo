package com.sidd.javademo.application.datastructure.sort;

public class BubbleSort {

    public static void main(String args[]) {
        int intarray[] ={20, 35, -15, 7, 55, 1, -22};

        for(int lastUnSortedIndex = intarray.length-1; lastUnSortedIndex > 0; lastUnSortedIndex--) {
            for(int i=0; i< lastUnSortedIndex; i++) {
                if(intarray[i] > intarray[i+1]) {
                    swap(intarray, i, i+1);
                }
            }

        }

        for (int i=0; i<intarray.length; i++) {
            System.out.println(intarray[i]);
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