package com.example.javaspringmaven.patterns.decorator;

public class SimplePrinter implements Printer {
    @Override
    public void print(String msg) {
        System.out.println(msg);
    }
}