package com.example.javaspringmaven.trasformacion1;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 
 */
@Data
@AllArgsConstructor
public class YearMonthValue {
    private int year;
    private List<MonthValue> monthValues;
}
