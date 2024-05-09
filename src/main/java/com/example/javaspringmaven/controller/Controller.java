package com.example.javaspringmaven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.javaspringmaven.patterns.factory.FactoryComponent;
import com.example.javaspringmaven.patterns.factory.FactoryHardcode;

@RestController
public class Controller {

@Autowired
public FactoryComponent factroya;
@Autowired
public FactoryHardcode factroyaHard;
    // @ExceptionHandler(Exception.class)
    // @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @PostMapping("/")
    public String metodoRest(@RequestBody Integer body){
        // logicaInterna(body);
        factroya.metodo("ID2").comunMethod();
        factroyaHard.getObjectTypePostConstruct("ID1").comunMethod();
        factroyaHard.getObjectTypeSimple("ID1").comunMethod();
        return "pikachu";
    }

    private void logicaInterna(Integer body) {
       if (body.equals(2)) {
         CustomExeption error = new CustomExeption();
         System.out.println(error.getMessage());
         throw error;
       }
    }
}
