package com.example.javaspringmaven.mono;

import java.util.function.BiPredicate;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
@Component
@AllArgsConstructor
public class Tester implements BiPredicate<JsonNode, String>{
  
    @Override
    public boolean test(JsonNode node, String filtro) {
   
      return filtro.equals(node.get("moneda").asText());
    }
    
}
