package com.sidd.javademo.application.programs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubArray {
    private static final Logger logger = LoggerFactory.getLogger(SubArray.class);

    public static void main(String args[]) {

        /*String[] array = {"a", "b", "c", "d", "e", "f", "g"};
        logger.info("Please enter the string :");
        Scanner scnr = new Scanner(System.in);
        String value = scnr.nextLine();
        logger.info("Please enter the begin value: ");
        int beg= scnr.nextInt();
        logger.info("please enter the end value: ");
        int end = scnr.nextInt();

        char[] arrays = value.toCharArray();
        char[] subarray= Arrays.copyOfRange(arrays, beg, end+1);
        logger.info("Substring value: "+  subarray);*/

        /*String[] arr = { "A", "B", "C", "D", "E", "F", "G", "H" };
        int beg = 1, end = 4;

        String[] subarray = subArray(arr, beg, end);
        System.out.println(Arrays.toString(subarray));

    }

    public static<T> T[] subArray(T[] array, int beg, int end) {
        return Arrays.copyOfRange(array, beg, end + 1);
    }*/


        // Get subarray of a non-primitive array between specified indices

       /* String[] arr = {"A", "B", "C", "D", "E", "F", "G", "H"};
        int beg = 1, end = 4;

        String[] subarray = IntStream.range(beg, end + 1)
                .mapToObj(i -> arr[i])
                .toArray(String[]::new);

        System.out.println(Arrays.toString(subarray));
*/


    }
}
