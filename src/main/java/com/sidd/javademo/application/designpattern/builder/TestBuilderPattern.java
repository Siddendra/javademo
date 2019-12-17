package com.sidd.javademo.application.designpattern.builder;

public class TestBuilderPattern {

    public static void main(String args[]) {
        //using builder to get the oject in a single line of code and without
        // any consistent state or argument management issues

        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
    }
}
