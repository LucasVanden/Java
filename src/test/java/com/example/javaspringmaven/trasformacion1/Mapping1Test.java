package com.example.javaspringmaven.trasformacion1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class Mapping1Test {

    @InjectMocks
    private Mapping1 maping;
    
    @Autowired
    ObjectMapper objectMapper;

    // @Mock

    @BeforeEach
    void setUp() {
        // objectMapper = new ObjectMapper(); 
    }

    @Test
    void testTrasformar() throws IOException {

       List<YearMonthValue> result = maping.trasformar();
       JsonNode resultExpected = objectMapper.valueToTree(result);

       String expected = new String(Files.readAllBytes(Paths.get("src/test/java/com/example/javaspringmaven/trasformacion1/expect.json")));
       JsonNode jsonStringExpected = objectMapper.readTree(expected);

       assertEquals( jsonStringExpected,resultExpected);
    }
    @Test
    void testTrasformar2() throws IOException {

        DateTimeFormatter formaterr = DateTimeFormatter.ofPattern("yyyyMM");
        YearMonth date1 = YearMonth.parse("202408", formaterr);
     
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM", new Locale("es", "ES"));
        // LocalDate date = LocalDate.parse("20240501",formaterr);
       
       assertEquals( true,  YearMonth.now().equals(date1) );
    }
}
