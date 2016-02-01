package com.spock.edu;


public final class FindService {

    public static <T> T find(Iterable<T> datas, Predicate<T> pred) {
        for (T t : datas) {
            if (pred.satisfy(t)) {
                return t;
            }
        }
        return null;
    }

    private FindService() {
    }
}
