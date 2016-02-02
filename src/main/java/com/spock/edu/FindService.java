package com.spock.edu;


import java.util.Optional;

public final class FindService {

    public static <T> Optional<T> find(Iterable<? extends T> datas, Predicate<? super T> pred) {
        for (T t : datas) {
            if (pred.satisfy(t)) {
                return Optional.of(t);
            }
        }
        return Optional.empty();
    }

    private FindService() {
    }
}
