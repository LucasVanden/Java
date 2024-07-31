package com.example.javaspringmaven.mono;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import static com.example.javaspringmaven.mockstatic.MockStatic.mockLocalDateNow;

@ExtendWith(MockitoExtension.class)
@SpringBootTest(classes = {
    Filtro.class,
    Tester.class,
    Sumador.class,
    JsonNodeUtil.class,ObjectMapper.class
})
@ContextConfiguration(classes = {})
public class FiltroTest {

    @Autowired
    private Filtro sut;

    @Autowired
    ObjectMapper objectMapper;
    
    private static final LocalDate FAKE_NOW = LocalDate.of(2024, 6, 29);

    @Test
    @DisplayName("Testear algo 1")
    void testApply() throws IOException {

        try(MockedStatic<LocalDate> mockedStatic = Mockito.mockStatic(LocalDate.class, Mockito.CALLS_REAL_METHODS)){

            String expected = new String(Files.readAllBytes(Paths.get("src/test/java/com/example/javaspringmaven/mono/input/example.json")));
            JsonNode jsonStringExpected = objectMapper.readTree(expected);

            mockedStatic.when(LocalDate::now).thenReturn(FAKE_NOW);
            sut.apply(jsonStringExpected);
        }

    }
}
