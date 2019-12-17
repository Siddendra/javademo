package com.sidd.javademo.application.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

    private List<String> empList;

    public Employee() {
        empList = new ArrayList<String>();
    }

    public Employee(List<String> list) {
       this.empList = list;
    }

    public void loadData() {
        //read all employees from the Database and put into the list
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for(String s : this.getEmpList()) {
            temp.add(s);
        }
        return new Employee(temp);
    }
}
