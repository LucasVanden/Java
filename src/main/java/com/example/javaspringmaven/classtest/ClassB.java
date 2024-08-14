package com.example.javaspringmaven.classtest;

import java.util.function.Function;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.JsonNode;
import reactor.core.publisher.Mono;

@Component
public class ClassB implements Function<JsonNode, Mono<String>>{

    @Override
    public Mono<String> apply(JsonNode json) {
        return Mono.justOrEmpty(json)
            .map(aaa->aaa.get(0).get("item").asText());
            // .filter(jsonData->jsonData.has("item"))
            // .map(jsonDataFiltered->jsonDataFiltered.get("item").asText());
    }
    
}
