package com.example.javaspringmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static com.example.javaspringmaven.enums.Day.MONDAY;
import com.example.javaspringmaven.optional.OptionalTest;
import com.example.javaspringmaven.trasformacion1.Mapping1;
import com.example.javaspringmaven.trasformacion1.Maping2;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import com.example.javaspringmaven.patterns.factory.Factory;
import com.example.javaspringmaven.patterns.factory.FactoryComponent;
import com.example.javaspringmaven.patterns.factory.FactoryHardcode;
import com.example.javaspringmaven.patterns.decorator.DecoratorUse;

@Slf4j
@SpringBootApplication
public class JavaspringmavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaspringmavenApplication.class, args);

		DecoratorUse decorator = new DecoratorUse();
		decorator.use("hola");

	}

}
