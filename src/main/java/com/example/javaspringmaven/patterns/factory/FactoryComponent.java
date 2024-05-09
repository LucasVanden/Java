package com.example.javaspringmaven.patterns.factory;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
public class FactoryComponent {

    private final Factory factory;
    
    @Autowired
    public FactoryComponent(Factory factory) {
        this.factory = factory;
    }

public ObjetInterface metodo (String id){
    return factory.getImplementation(id);
}
}
