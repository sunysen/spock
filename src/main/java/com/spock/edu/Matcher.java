package com.spock.edu;

/**
 * Created by hongsen on 16/2/2.
 */
public interface Matcher<T> {
    boolean matched(T t);

    static <T> Matcher<T> eq(T expected) {
        return actual -> expected.equals(actual);
    }

    static <T> Matcher<T> ne(T expected) {
        return actual -> !expected.equals(actual);
    }
}
