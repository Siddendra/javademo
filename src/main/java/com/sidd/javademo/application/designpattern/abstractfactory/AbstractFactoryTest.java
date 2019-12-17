package com.sidd.javademo.application.designpattern.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String args[]) {
        testAbstractFactory();
    }

    public static void testAbstractFactory() {
        Computer pc = com.sidd.javademo.application.designpattern.abstractfactory.ComputerFactory.getComputer(new PCFactory("2 GB","500 GB", "2.4 GHZ"));
        Computer server = com.sidd.javademo.application.designpattern.abstractfactory.ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB", "2.9 GHZ"));

        System.out.println("Abstract PC Config :: "+ pc);
        System.out.println("Abstract Server Config :: "+ server);
    }
 }
