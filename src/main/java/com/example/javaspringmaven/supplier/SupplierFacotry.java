package com.example.javaspringmaven.supplier;

import java.util.HashMap;
import java.util.Optional;
import java.util.function.Supplier;
import com.example.javaspringmaven.supplier.figura.Circulo;
import com.example.javaspringmaven.supplier.figura.Figura;
import com.example.javaspringmaven.supplier.figura.Rectangulo;




public class SupplierFacotry {

    private static HashMap<String,Supplier<Figura>> map= new HashMap<>();
  
  static {
    
    map.put("rectangulo", Rectangulo::new);
    map.put("circulo", Circulo::new);
    
  }
  
  public static Figura crearFigura(String tipo) {
    Optional<Supplier<Figura>> figurita = Optional.ofNullable(map.get(tipo));


    Optional<Figura> str = Optional.ofNullable(new Rectangulo());
    System.out.println(str.orElse(new Circulo()));


    return figurita.map(fig->fig.get())
        .orElse(null);


    //   if (map.get(tipo)!=null) {
        
    //     return map.get(tipo).get();
    //   }else {
    //     return null;
    //   }
    
  }
}

