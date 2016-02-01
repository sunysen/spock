package com.spock.edu

import static com.spock.edu.Students.*

import spock.lang.Specification

class StudentsSpec extends Specification {

    def "find student by condition"() {
        when:
        List<Student> students = Arrays.asList(new Student(30, "horance"), new Student(26, "hongsen"));

        then:
        find(students, { s -> s.getAge() == 30 }) != null
    }
}
