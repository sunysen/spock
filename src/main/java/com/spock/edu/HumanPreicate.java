package com.spock.edu;

/**
 * Created by hongsen on 16/2/2.
 */
public class HumanPreicate {
    private HumanPreicate() {
    }

    public static Predicate<Human> age(Matcher<Integer> matcher) {
        return s -> matcher.matched(s.getAge());
    }

    public static Predicate<Human> name(String name) {
        return s -> name.equals(s.getName());
    }
}
