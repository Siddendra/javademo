package com.sidd.javademo.application.datastructure.list.domain;

import java.util.Objects;



public class Employee {
    private String firtName;
    private String LastName;
    private int id;

    public Employee(String firtName, String lastName, int id) {
        this.firtName = firtName;
        LastName = lastName;
        this.id = id;
    }

    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firtName='" + firtName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                firtName.equals(employee.firtName) &&
                LastName.equals(employee.LastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firtName, LastName, id);
    }
}
