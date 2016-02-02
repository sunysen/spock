package com.spock.edu;

/**
 * Created by hongsen on 16/2/2.
 */
public final class Matchers {

    public static <T> Matcher<T> eq(T expected) {
        return actual -> expected.equals(actual);
    }

    public static <T> Matcher<T> ne(T expected) {
        return actual -> !expected.equals(actual);
    }

    public static <T extends Comparable<? super T>> Matcher<T> gt(T expected) {
        return actual -> compare(actual, expected) > 0;
    }

    public static <T extends Comparable<? super T>> Matcher<T> lt(T expected) {
        return actual -> compare(actual, expected) < 0;
    }

    private static <T extends Comparable<? super T>> int compare(T actual, T expected) {
        return Ordering.<T>order().compare(actual, expected);
    }

    private Matchers() {
    }
}
