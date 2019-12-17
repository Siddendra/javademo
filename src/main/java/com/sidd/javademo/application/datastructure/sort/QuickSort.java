package com.sidd.javademo.application.datastructure.sort;

public class QuickSort {

    public static void main(String args[]) {

        int arr[] = {9, 8 , 4, 6, 2, 1, 3};

        QuickSort qs = new QuickSort();
        qs.sort(arr, 0, arr.length-1);

        System.out.println("The Sorted Array is : ");
        for (int i =0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }

    private void sort(int[] arr, int low, int high) {

        if(low < high) {
            int pi = partition(arr, low, high);
            sort(arr, 0, pi-1);
            sort(arr, pi+1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivate = arr[high];
        int i = low-1;

        for(int j= low; j< high; j++) {
            if(arr[j] < pivate) {
                 i++;
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
            }

        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;

    }


}
