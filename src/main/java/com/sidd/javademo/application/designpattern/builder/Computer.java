package com.sidd.javademo.application.designpattern.builder;

public class Computer {
    //required parameters
    private String hdd;
    private String ram;

    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHdd() {
        return hdd;
    }

    public String getRam() {
        return ram;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private Computer(ComputerBuilder builder) {
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    //Builder Class

    public static class ComputerBuilder {

        //required parameters
        private String hdd;
        private String ram;

        //optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.hdd = hdd;
            this.ram = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return  this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
