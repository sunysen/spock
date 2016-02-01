package com.spock.edu

import spock.lang.Specification

/**
 * Created by hongsen on 16/2/1.
 */
class TeachersSpec extends Specification {
    def "find teacher by condition"() {
        when:
        List<Teacher> teachers = Arrays.asList(new Teacher(false), new Teacher(true))

        then:
        Teachers.find(teachers,{teacher -> teacher.female()})
    }
}
