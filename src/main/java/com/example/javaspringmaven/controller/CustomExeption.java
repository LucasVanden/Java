package com.example.javaspringmaven.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


// @ResponseStatus(value = HttpStatus.CONFLICT, reason="reason X")
public class CustomExeption extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "Algo exploto, revise su microhondas";

    public CustomExeption() {
        super(DEFAULT_MESSAGE);
    }
}
