package com.sidd.javademo.application.java8;

public class Student {
    String name;
    String section;
    int rollNum;

    public Student(String name, String section, int rollNum) {
        this.name = name;
        this.section = section;
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecction() {
        return section;
    }

    public void setSecction(String secction) {
        this.section = secction;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }
}
