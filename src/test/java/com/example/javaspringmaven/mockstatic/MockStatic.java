package com.example.javaspringmaven.mockstatic;

import java.time.LocalDate;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class MockStatic {
    public static void mockLocalDateNow(LocalDate date, Runnable test){
        try(MockedStatic<LocalDate> mockedStatic = Mockito.mockStatic(LocalDate.class, Mockito.CALLS_REAL_METHODS)){
            mockedStatic.when(LocalDate::now).thenReturn(date);
         test.run();   
        }
    }
}
