package com.sidd.javademo.application.object;

//import java.util.Objects;

import java.util.Objects;

public class User {
   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                name.equals(user.name) &&
                passport.equals(user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, passport);
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                name.equals(user.name) &&
                passport.equals(user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, passport);
    }

    private String passport;

    public User(String name, int age, String passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }

}
