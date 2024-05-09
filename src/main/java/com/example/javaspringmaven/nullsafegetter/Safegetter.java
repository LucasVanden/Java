package com.example.javaspringmaven.nullsafegetter;

import java.util.function.Supplier;
import java.util.Optional;


public class Safegetter {
    private Safegetter() {
        throw new IllegalStateException(Safegetter.class.getName());
    }

    public static <T> Optional<T> nullSafeGetter(Supplier<T> resolver) {
        try {
            T result = resolver.get();
            return Optional.ofNullable(result);
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            return Optional.empty();
        }
    }
}
