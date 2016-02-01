package com.spock;

public class AgePredicate implements StudentPredicate {

    private int age;

    public AgePredicate(int age) {
        this.age = age;
    }

    @Override public boolean matched(Student student) {
        return student.getAge() == age;
    }
}
