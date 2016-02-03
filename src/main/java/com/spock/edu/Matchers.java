package com.spock.edu;

import java.util.function.Function;

/**
 * Created by hongsen on 16/2/2.
 */
public final class Matchers {

    public static <T> Matcher<T> eq(T expected) {
        return actual -> actual.equals(expected);
    }

    public static <T> Matcher<T> ne(T expected) {
        return actual -> !actual.equals(expected);
    }

    public static <T> Matcher<T> not(T expected) {
        return not(ne(expected));
    }

    public static <T> Matcher<T> not(Matcher<T> matcher) {
        return actual -> !matcher.matched(actual);
    }

    public static Matcher<String> contains(String expected) {
        return actual -> actual.contains(expected);
    }

    public static Matcher<String> starts(String expected) {
        return actual -> actual.startsWith(expected);
    }

    public static Matcher<String> startsIgnoringCase(String expected) {
        return ignoringCase(Matchers::starts, expected);
    }

    private static Matcher<String> ignoringCase(Function<String, Matcher<String>> m, String expected) {
        return str -> m.apply(expected.toLowerCase()).matched(str.toLowerCase());
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

    public static <T> Matcher<T> anyof(Matcher<T>... matchers) {
        return of(true, matchers);
    }

    public static <T> Matcher<T> allof(Matcher<T>... matchers) {
        return of(false, matchers);
    }

    private static <T> Matcher<T> of(boolean shortCut, Matcher<T>... matchers) {
        return actual -> {
            for (Matcher<T> matcher : matchers) {
                if (matcher.matched(actual) == shortCut) {
                    return shortCut;
                }
            }
            return !shortCut;
        };
    }

    private Matchers() {
    }
}
