package com.example.javaspringmaven.optional;

import java.util.Optional;
import java.util.Random;

public class OptionalTest {

    // Optional<Boolean> optional1 = Optional.of(null);    

    // Optional<Boolean> optional = Optional.ofNullable(null);
    
    public void method1(String string){

        Optional<String> optional = Optional.ofNullable(string);
        
        //isEmpty
        optional.isEmpty();

        //ifPresent
        optional.ifPresent(valor-> System.out.println(valor));
        
        //ifPresenOrElse
        optional.ifPresentOrElse(
            
            valor-> {System.out.println("presente"+valor);}, 
            ()-> System.out.println("no presente")

        );
        //or Else
        System.out.println(optional.orElse(getRandomName()));
        System.out.println(optional.orElseGet(()->getRandomName()+"otro valor que no se instancia si pasa"));


        //Or , devuelve otro Optional
        System.out.println(optional.or(()->Optional.of("s")));


        //checks returns
        Optional<String> str = Optional.ofNullable("mono");
        System.out.println(str.orElse("tipo"));

    }

    public String getRandomName() {
    System.out.println("getRandomName() method - start");
    
    Random random = new Random();
    int index = random.nextInt(5);
    
    System.out.println("getRandomName() method - end");
    return String.valueOf(index);
}
}
