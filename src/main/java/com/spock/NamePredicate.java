package com.spock;

public class NamePredicate implements StudentPredicate {

    private String name;

    public NamePredicate(String name) {
        this.name = name;
    }

    @Override public boolean matched(Student student) {
        return "hongsen".equals(student.getName());
    }
}
