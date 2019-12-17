package com.sidd.javademo.application.datastructure.arrays;

public class SingleArray {

    public static void main(String args[]) {
        int[] intarry = new int[7];
        intarry[0] = 1;
        intarry[1] = 2;
        intarry[2] = 3;
        intarry[3] = 4;
        intarry[4] = 5;
        intarry[5] = 6;
        intarry[6] = 7;


        for(int i= 0; i< intarry.length; i++) {
            System.out.println(intarry[i]);
        }
    }
}
