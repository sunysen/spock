package com.spock.edu;

/**
 * Created by hongsen on 16/2/2.
 */
public interface Matcher<T> {
    boolean matched(T actual);
}
