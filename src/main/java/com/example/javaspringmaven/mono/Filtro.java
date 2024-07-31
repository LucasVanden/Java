package com.example.javaspringmaven.mono;

import java.util.function.Function;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Component
@AllArgsConstructor
public class Filtro implements Function<JsonNode, Mono<JsonNode>>{
  
private final JsonNodeUtil jsonNodeUtil;
private final Tester filtroMoneda;

    @Override
    public Mono<JsonNode> apply(JsonNode node) {
   
      return Mono.justOrEmpty(node)
        .flatMap(nodo->Flux.fromIterable(nodo)
         .filter(operacion->filtroMoneda.test(operacion,"dolar"))
          .collectList())
          
          
          .flatMap(list->Mono.just(jsonNodeUtil.apply(list)));
    }
    
}
