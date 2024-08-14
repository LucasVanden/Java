package com.example.javaspringmaven.classtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.ContextConfiguration;
import com.example.javaspringmaven.mono.Filtro;
import com.fasterxml.jackson.databind.ObjectMapper;
import reactor.core.publisher.Mono;


// @ExtendWith(MockitoExtension.class)

/**
 * used for writing integration tests that require the full Spring application
 * context to be loaded. Reciving parameter classes only load that class to
 * better performance
 */
@SpringBootTest(classes = {ClassA.class, ClassB.class, ClassC.class,
        ObjectMapper.class})
// @ContextConfiguration(classes = {})
public class ClassCTest {

    @Autowired
    private ClassC sut;
    /**
     * MockBean use to mock a class in integration Test
     */
    @MockBean
    private ClassB mockClassB;

    @SpyBean
    private ClassA spyClassA;
    
    @Test
    void testMetodoAlgo() {

        /**
         * doReturn: avoid method invocation
         */
        doReturn(Mono.just("StringMock1")).when(mockClassB).apply(any());
        /**
         * when: could lead to the real method being executed
         */
        when(mockClassB.apply(any())).thenReturn(Mono.just("StringMock"));


       String res = sut.metodoAlgo("src/test/java/com/example/javaspringmaven/classtest/input/jsonExample.json","bla");

        assertEquals("hola",res);
    }
}