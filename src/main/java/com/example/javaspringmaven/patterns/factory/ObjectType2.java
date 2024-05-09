package com.example.javaspringmaven.patterns.factory;

import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
@Component
@Slf4j
public class ObjectType2 implements ObjetInterface{

    @Override
    public String getIdentifider() {
        return "ID2";
    }

    @Override
    public void comunMethod() {
        log.info("Metodo ObjectType2");
    }
    
}
