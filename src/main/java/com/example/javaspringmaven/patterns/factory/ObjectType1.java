package com.example.javaspringmaven.patterns.factory;

import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
@Component
@Slf4j
public class ObjectType1 implements ObjetInterface{

    @Override
    public String getIdentifider() {
        return "ID1";
    }

    @Override
    public void comunMethod() {
        log.info("Metodo ObjectType1");
    }
    
}
