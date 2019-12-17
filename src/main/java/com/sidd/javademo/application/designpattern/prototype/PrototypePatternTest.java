package com.sidd.javademo.application.designpattern.prototype;

import java.util.List;

public class PrototypePatternTest {

    public static void main(String args[]) throws CloneNotSupportedException {

        Employee emp = new Employee();
        emp.loadData();

        //use the clone method to get the Employee object
        Employee empsNew = (Employee) emp.clone();
        Employee empsnew1 = (Employee) emp.clone();
        List<String> list = empsNew.getEmpList();
        list.add("Amar");
        List<String> list1 = empsnew1.getEmpList();
        list1.remove("Pankaj");
        System.out.println("Emp List :" + emp.getEmpList());
        System.out.println("Emp New Lsit"+list);
        System.out.println("Emp New1 Lsit"+list1);

    }
}
