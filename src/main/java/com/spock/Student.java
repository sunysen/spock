package com.spock;

/**
 * Created by hongsen on 16/1/31.
 */
public class Student {
    private int age;
    private String name;

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
