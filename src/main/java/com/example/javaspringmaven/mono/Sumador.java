package com.example.javaspringmaven.mono;

import java.util.function.Function;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Component
@AllArgsConstructor
public class Sumador implements Function<JsonNode, Mono<Long>>{
private final JsonNodeUtil jsonNodeUtil;
    @Override
    public Mono<Long> apply(JsonNode node) {
   
      return Mono.justOrEmpty(node)
        .flatMap(nodo->Flux.fromIterable(nodo)
          .map(operacion->operacion.get("monto").asLong())
          .reduce(0L,Long::sum));
    }
    
}
