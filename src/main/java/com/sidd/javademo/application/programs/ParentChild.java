package com.sidd.javademo.application.programs;// A Java program to demonstrate that non-method
// members are accessed according to reference 
// type (Unlike methods which are accessed according 
// to the referred object) 

class Parent
{
    int value = 1000;
    Parent()
    {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent
{
    int value = 10;
    Child()
    {
        System.out.println("Child Constructor");
    }
}

// Driver class 
class ParentChild
{
    public static void main(String[] args)
    {
        Child obj=new Child();
        System.out.println("Reference of Child Type :"
                + obj.value);
        Parent par1 = new Parent();
        System.out.println("Reference of Parent Type1 : "
                + par1.value);
        // Note that doing "Parent par = new Child()"
        // would produce same result
        Parent par = obj;

        // Par holding obj will access the value
        // variable of parent class
        System.out.println("Reference of Parent Type : "
                + par.value);
    }
} 
