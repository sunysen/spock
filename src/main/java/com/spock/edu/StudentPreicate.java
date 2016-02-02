package com.spock.edu;

/**
 * Created by hongsen on 16/2/2.
 */
public class StudentPreicate {
    private StudentPreicate() {
    }

    public static Predicate<Student> age(int age) {
        return s -> s.getAge() == age;
    }

    public static Predicate<Student> name(String name) {
        return s -> name.equals(s.getName());
    }
}
