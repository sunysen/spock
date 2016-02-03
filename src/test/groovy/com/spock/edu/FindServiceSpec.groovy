package com.spock.edu

import spock.lang.Specification

import static com.spock.edu.FindService.*
import static Matchers.*
import static HumanPreicate.*
import static com.spock.edu.Human.*

/**
 * Created by hongsen on 16/2/1.
 */
class FindServiceSpec extends Specification {
    def "find data by condititon"() {
        when:
        List<Human> students = Arrays.asList(student(12, true, "horance"), student(18, true, "hongsen"), student(18, true, "TOM"));
        List<Human> teachers = Arrays.asList(teacher(35, false, "Tom"), teacher(39, false, "Abby"))

        then:
        find(students, { student -> student.getAge() == 18 }) != null
        find(teachers, { teacher -> teacher.isFemale() }) != null
        find(students, age(eq(18))) != null
        find(students, age(not(28))) != null
        find(students, age(lt(14))) != null
        find(students, age(gt(17))) != null;
        find(students, name(contains("hor"))) != null;
        find(students, name(starts("hong"))) != null;
        find(students, name(startsIgnoringCase("TO"))) != null;
        find(students, age(gt(20))) == Optional.empty();
        find(students, age(not(28)).and({ s -> "hongsen".equals(s.getName()) })) != null
        find(students, name(anyof(starts("hong"), contains("xxx")))) != null
        find(students, name(allof(starts("hong"), contains("sen")))) != null
        find(students, name(allof(starts("hong"), contains("xxx")))) == Optional.empty()
    }

}
