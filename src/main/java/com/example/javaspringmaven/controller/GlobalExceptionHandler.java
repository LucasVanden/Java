package com.example.javaspringmaven.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomExeption.class)
    public ResponseEntity<String> handleCustomException(CustomExeption e) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
    }
}