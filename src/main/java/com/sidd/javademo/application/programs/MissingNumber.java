package com.sidd.javademo.application.programs;

class Main {
    // Function to find missing number
    static int getMissingNo(int a[], int n)
    {
        int i, total;
        total = (n+1) * (n + 2) / 2; // n*(n+1)/2
        for (i = 0; i < n-1; i++)
            total -= a[i];
        return total;
    }

    /* program to test above function */
    public static void main(String args[])
    {
        int a[] = { 1, 2, 4, 5, 6 };
        int miss = getMissingNo(a, 6);
        System.out.println(miss);
    }
}