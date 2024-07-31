package com.example.javaspringmaven.wtf;

import java.util.List;
import lombok.NoArgsConstructor;
@NoArgsConstructor

public class Wtf {
    private Long cantidad;
    private List<String> lista;

    public Long getCantidad(){
        return this.lista != null ? this.lista.size(): 0L;
    }
}
