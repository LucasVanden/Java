package com.example.javaspringmaven.patterns.decorator.consumer;
import java.util.function.Consumer;
import java.util.function.Function;


public class UpercasePrinter implements Function<String,String>{



    @Override
    public String apply(String t) {
        return t.toUpperCase();
    }
    
}
