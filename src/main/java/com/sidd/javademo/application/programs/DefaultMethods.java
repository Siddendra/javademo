package com.sidd.javademo.application.programs;

interface I1
{
    public String getGreeting();
}

interface I2
{
    public String getGreeting();

}

public class DefaultMethods implements I1, I2 // won't compile
{
    public String getGreeting(){
        return "Greetings here";
    };
    public static void main(String[] args)
    {
        System.out.println(new DefaultMethods().getGreeting());
    }


}
