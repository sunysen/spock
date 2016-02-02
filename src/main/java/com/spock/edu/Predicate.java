package com.spock.edu;

public interface Predicate<T> {
    boolean satisfy(T t);

    default Predicate<T> and(Predicate<? super T> other) {
        return t -> satisfy(t) && other.satisfy(t);
    }
}
