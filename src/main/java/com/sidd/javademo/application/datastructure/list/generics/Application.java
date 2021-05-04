package com.sidd.javademo.application.datastructure.list.generics;

public class Application {
    public static void main(String args[]) {
        LinkedList<Person> people = new LinkedList<>();
        Person p = new Person(27, "Anu");
        people.insert(p);
        people.insert(new Person(29, "Van"));
        people.insert(new Person(39, "Sidd"));

        people.traverse();
        people.remove(p);
        people.traverse();
    }
}
