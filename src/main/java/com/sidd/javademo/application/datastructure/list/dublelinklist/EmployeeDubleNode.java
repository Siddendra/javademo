package com.sidd.javademo.application.datastructure.list.dublelinklist;

import com.sidd.javademo.application.datastructure.list.domain.Employee;

public class EmployeeDubleNode {
    private Employee employee;
    private EmployeeDubleNode next;
    private EmployeeDubleNode previous;

    public EmployeeDubleNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeDubleNode previous) {
        this.previous = previous;
    }

    public EmployeeDubleNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDubleNode getNext() {
        return next;
    }

    public void setNext(EmployeeDubleNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
