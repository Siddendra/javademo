package com.sidd.javademo.application.programs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LargestSmallest {
    static Logger logger = LoggerFactory.getLogger(LargestSmallest.class);
    public static void main(String args[]){
        int[] array = new int[]{12, 2,34, 5, 6, 9, 13, 67, 99};

        int max = array[0], min = array[0];
        for(int i=0; i< array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
            if(array[i] > max) {
                max = array[i];
            }
        }

        logger.info("Largest Numer is : "+max);
        logger.info("Smallest number is : "+min);

    }
}
