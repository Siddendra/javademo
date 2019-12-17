package com.sidd.javademo.application.object;


class CloneObject implements Cloneable {
    int rollno;
    String name;

    CloneObject(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String args[]) {
        try {
            CloneObject s1 = new CloneObject(101, "amit");

            CloneObject s2 = (CloneObject) s1.clone();

            System.out.println(s1.rollno + " " + s1.name);
            System.out.println(s2.rollno + " " + s2.name);

        } catch (CloneNotSupportedException c) {
        }

    }
}