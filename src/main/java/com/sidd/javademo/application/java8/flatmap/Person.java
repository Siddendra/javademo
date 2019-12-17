package com.sidd.javademo.application.java8.flatmap;

import java.util.Optional;

public class Person {
    Optional<Country> country;

    public Person() {
    }

    public Person(Optional<Country> country) {
        this.country = country;
    }

    public Optional<Country> getCountry() {
        return country;
    }

    public void setCountry(Optional<Country> country) {
        this.country = country;
    }
}
