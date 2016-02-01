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
        FindService.find(students, { student -> student.getAge() == 30 })
        FindService.find(teachers, { teacher -> teacher.female() })
    }
}
