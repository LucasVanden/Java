package com.example.javaspringmaven.patterns.strategy.classic;
import org.junit.jupiter.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

 class ContextTest {

    @Test
    void test(){

        Context context = new Context();
        Strategy strategy = new Strategy1();
        context.setStrategy(strategy);

        context.executeStrategy(3);

        // verify(strategy, times(5)).executeStrategy(3);
        // verify(mock, never()).someMethod("was never called");
        // verify(mock, atLeastOnce()).someMethod("was called at least once");
        // verify(mock, atLeast(2)).someMethod("was called at least twice");
        // verify(mock, atMost(3)).someMethod("was called at most 3 times");
        // verify(mock, atLeast(0)).someMethod("was called any number of times"); // useful with captors
        // verify(mock, only()).someMethod("no other method has been called on the mock");
    }

    @Test
    void test2(){

        Context context = new Context();
        Strategy strategy = new Strategy2();
        context.setStrategy(strategy);

        context.executeStrategy(3);
    }
}
