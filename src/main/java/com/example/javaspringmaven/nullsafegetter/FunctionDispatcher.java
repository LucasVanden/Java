package com.example.javaspringmaven.nullsafegetter;

import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;

public class FunctionDispatcher {
public void aslog(){
        Map<String, Function<String, Integer>> functionMap = new HashMap<>();

        // Populate the map with functions
        functionMap.put("length", String::length);
        functionMap.put("uppercase", s -> s.toUpperCase().hashCode());
        functionMap.put("lowercase", s -> s.toLowerCase().hashCode());

        String input = "Hello, World!";
        String key = "length"; // Change this key to test different functions

        // Retrieve and apply the appropriate function based on the key
         int result =  functionMap.getOrDefault(key, s -> -1).apply(input); // Default function if key not found

        
        System.out.println("Result of " + key + " function for '" + input + "': " + result);
        }
}