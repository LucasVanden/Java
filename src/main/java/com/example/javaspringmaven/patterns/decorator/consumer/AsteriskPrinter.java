package com.example.javaspringmaven.patterns.decorator.consumer;

import java.util.function.Function;


public class AsteriskPrinter implements Function<String,String>{



    @Override
    public String apply(String t) {
        return "**"+t+"**";
    }
    
}
