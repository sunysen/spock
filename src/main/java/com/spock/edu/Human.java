package com.spock.edu;

public class Human {
    private int     age;
    private boolean male;
    private String  name;

    public Human() {
    }

    private Human(int age, boolean male, String name) {
        this.age = age;
        this.name = name;
        this.male = male;
    }

    public static Human student(int age, boolean male, String name) {
        return new Human(age, male, name);
    }

    public static Human teacher(int age, boolean male, String name) {
        return new Human(age, male, name);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return male;
    }

    public boolean isFemale() {
        return !male;
    }
}
