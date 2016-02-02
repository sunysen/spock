package com.spock.edu;

import java.util.Comparator;

/**
 * Created by hongsen on 16/2/2.
 */
public final class Ordering {
    private Ordering() {
    }

    public static <T extends Comparable<? super T>> Comparator<T> order() {
        return (t1, t2) -> t1.compareTo(t2);
    }
}
