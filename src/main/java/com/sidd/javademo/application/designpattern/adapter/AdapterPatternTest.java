package com.sidd.javademo.application.designpattern.adapter;

public class AdapterPatternTest {

    public static void main(String args[]) {
        testClassAdapter();
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        Volt v3 = getVolts(socketAdapter, 3);
        Volt v12 = getVolts(socketAdapter, 12);
        Volt v120 = getVolts(socketAdapter, 120);
        System.out.println("V3 volts using Object Adapter ="+v3.getVolts());
        System.out.println("V12 volts using Object Adapter ="+v12.getVolts());
        System.out.println("V120 volts using Object Adapter ="+v120.getVolts());
    }

    private static void testClassAdapter() {
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt v3 = getVolts(socketAdapter, 3);
        Volt v12 = getVolts(socketAdapter, 12);
        Volt v120 = getVolts(socketAdapter, 120);
        System.out.println("V3 volts using Class Adapter ="+v3.getVolts());
        System.out.println("V12 volts using Class Adapter ="+v12.getVolts());
        System.out.println("V120 volts using Class Adapter ="+v120.getVolts());


    }

    private static Volt getVolts(SocketAdapter socketAdapter, int i) {
        switch(i) {
            case 3: return socketAdapter.get3Volt();
            case 12: return socketAdapter.get12Volt();
            case 120: return socketAdapter.get120Volt();
            default: return socketAdapter.get120Volt();
        }
    }

}
