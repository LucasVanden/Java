package com.example.javaspringmaven.mono;

import java.util.function.Function;
import com.fasterxml.jackson.databind.JsonNode;
import reactor.core.publisher.Mono;

public class Mono1 implements Function<JsonNode, Mono<JsonNode>>{

    @Override
    public Mono<JsonNode> apply(JsonNode node) {
   
      return Mono.justOrEmpty(node);
    }
    
}
