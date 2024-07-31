package com.example.javaspringmaven.patterns.factory;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FactoryComponent {

    private final ObjectFactory<Factory> factory;
    
    @Autowired
    public FactoryComponent( ObjectFactory<Factory> factory) {
        this.factory = factory;
    }

public ObjetInterface metodo (String id){
    return factory.getObject().getImplementation(id);
}
}
