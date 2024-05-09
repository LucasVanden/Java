package com.example.javaspringmaven.patterns.factory;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Scope("prototype")
public class Factory {
    private final Map<String, ObjetInterface> myInterfaceMap;

    @Autowired
    private Factory(List<ObjetInterface> services) {
        myInterfaceMap = services.stream()
                .collect(Collectors.toMap(ObjetInterface::getIdentifider, Function.identity()));
    }

    public ObjetInterface getImplementation(String identifier) {
        return Optional.ofNullable(myInterfaceMap.get(identifier))
            .orElseThrow(IllegalArgumentException::new);
    }
}
