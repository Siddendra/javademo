package com.sidd.javademo.application.programs;

//Java program to print the smallest and second smallest elements in the array
public class SecondSmallest {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,6,7,8,9};
        print2Smallest(array);
    }

    private static void print2Smallest(int[] array) {
        int first, second, arr_size = array.length;

        //There should be at least two elements
        if(array.length < 2) {
            System.out.println("Invalid input");
            return;
        }
            first = second =Integer.MAX_VALUE;
            for(int i=0; i< arr_size; i++) {

                //if current element is smaller than the first then update first and second
                if(array[i] < first) {
                    second =first;
                    first =array[i];
                }

                //if a[i] is in between the first and second then update the second element
                else if(array[i]< second && array[i] != first){
                    second =array[i];

                }
            }
        if(second == Integer.MAX_VALUE) {
            System.out.println("There is no secong smallest element");
        } else {
            System.out.println("The Smallest element is :"+first + " Second smallest element is :"+second);
        }
    }
}
