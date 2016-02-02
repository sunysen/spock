package com.spock.edu

import spock.lang.Specification

import static com.spock.edu.FindService.*
import static Matchers.*
import static HumanPreicate.*

/**
 * Created by hongsen on 16/2/1.
 */
class FindServiceSpec extends Specification {
    def "find data by condititon"() {
        when:
        List<Human> students = Arrays.asList(Human.student(12, true, "horance"), Human.student(18, false, "hongsen"));
        List<Human> teachers = Arrays.asList(Human.teacher(35, false, "Tom"), Human.teacher(39, false, "Abby"))

        then:
        find(students, { student -> student.getAge() == 18 }) != null
        find(teachers, { teacher -> teacher.isFemale() }) != null
        find(students, name("hongsen")) != null
        find(students, age(eq(18))) != null
        find(students, age(ne(28))) != null
        find(students, age(lt(14))) != null
        find(students, age(gt(17))) != null;
        find(students, age(gt(20))) == Optional.empty();
        find(students, age(ne(28)).and({ s -> "hongsen".equals(s.getName()) })) != null
    }
}
