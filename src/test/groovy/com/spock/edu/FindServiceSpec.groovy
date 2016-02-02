package com.spock.edu

import spock.lang.Specification

import static com.spock.edu.FindService.*
import static com.spock.edu.Matcher.*
import static com.spock.edu.StudentPreicate.*

/**
 * Created by hongsen on 16/2/1.
 */
class FindServiceSpec extends Specification {
    def "find data by condititon"() {
        when:
        List<Student> students = Arrays.asList(new Student(30, "horance"), new Student(26, "hongsen"));
        List<Teacher> teachers = Arrays.asList(new Teacher(false), new Teacher(true))

        then:
        find(students, { student -> student.getAge() == 30 }) != null
        find(teachers, { teacher -> teacher.female() }) != null
        find(students, name("hongsen")) != null
        find(students, age(eq(30))) != null
        find(students, age(ne(28))) != null
        find(students, age(ne(28)).and({ s -> "hongsen".equals(s.getName()) })) != null
    }
}
