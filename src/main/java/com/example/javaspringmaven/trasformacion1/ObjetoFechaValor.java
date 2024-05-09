package com.example.javaspringmaven.trasformacion1;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ObjetoFechaValor {
    private LocalDate fecha;
    private double valor;

    public String getFechaString(){
        return fecha.toString();
    }

    public String getYear(){
        return fecha.toString().substring(0,4)+fecha.toString().substring(5,7);
    }
    public String getMonth(){
        return fecha.toString().substring(4,6);
    }
}
