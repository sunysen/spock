package com.spock.edu;

public class Teacher {
    private int     age;
    private String  name;
    private boolean male;

    public Teacher(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Teacher(boolean male) {
        this.male = male;
    }

    public boolean female() {
        return !male;
    }
}
