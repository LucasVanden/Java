package com.example.javaspringmaven.mono;

import java.util.List;
import java.util.function.Function;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
@Component
public class JsonNodeUtil implements Function<List<JsonNode>, JsonNode>{

    @Override
    public JsonNode apply(List<JsonNode> node) {
      ArrayNode arrayNOde = JsonNodeFactory.instance.arrayNode();
      node.forEach(arrayNOde::add);
      return arrayNOde;
    }
    
}
