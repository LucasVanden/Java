package com.example.javaspringmaven.classtest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Function;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class ClassA implements Function<String, Mono<JsonNode>> {

    private final ObjectMapper objectMapper;

    @Override
    public Mono<JsonNode> apply(String fileNamePath) {

        String expected;
        try {
            expected = new String(Files.readAllBytes(Paths.get(fileNamePath)));
            JsonNode jsonStringExpected = objectMapper.readTree(expected);
            return Mono.just(jsonStringExpected);
        } catch (IOException e) {
            return Mono.empty();
        }
    }
}
