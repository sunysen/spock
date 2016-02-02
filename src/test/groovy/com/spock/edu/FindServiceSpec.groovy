package com.spock.edu

import spock.lang.Specification

/**
 * Created by hongsen on 16/2/1.
 */
class FindServiceSpec extends Specification {
    def "find data by condititon"() {
        when:
        List<Student> students = Arrays.asList(new Student(30, "horance"), new Student(26, "hongsen"));
        List<Teacher> teachers = Arrays.asList(new Teacher(false), new Teacher(true))

        then:
        FindService.find(students, { student -> student.getAge() == 30 }) != null
        FindService.find(teachers, { teacher -> teacher.female() }) != null
        FindService.find(students, StudentPreicate.name("hongsen")) != null
        FindService.find(students, StudentPreicate.age(30)) != null
    }
}
