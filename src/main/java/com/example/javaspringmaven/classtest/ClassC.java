package com.example.javaspringmaven.classtest;

import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ClassC {
    private final ClassA classA;
    private final ClassB classB;

    public String metodoAlgo(String file,String atribute){
         JsonNode json = classA.apply(file).block();
         String campo = classB.apply(json).block();
         return campo;
    }
}
