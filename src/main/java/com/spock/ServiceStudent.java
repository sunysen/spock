package com.spock;

public class ServiceStudent {

    public Student find(Student[] students, StudentPredicate studentPredicate) {
        for (Student student : students) {
            if (studentPredicate.matched(student)) {
                return student;
            }
        }
        return null;
    }
}
