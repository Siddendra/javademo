package com.sidd.javademo.application.programs;

public class SystemExist {

    public static void main(String args[]) {

        System.out.println(validate());
    }

    private static int validate() {
        try {
            System.out.println("Try block");
            //System.exit(0);
            return 1;
        } finally {
            System.out.println("finally block");
            return 5;
        }
    }
}

