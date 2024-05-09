package com.example.javaspringmaven.trasformacion1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Maping2 {

    public List<ObjetoFechaValor> trasformar2() {

    List<ObjetoFechaValor> listaObjetos = new ArrayList<>();
    listaObjetos.add(new ObjetoFechaValor(LocalDate.of(2023, 5, 12), 100.0));
    listaObjetos.add(new ObjetoFechaValor(LocalDate.of(2023, 6, 20), 150.0));
    listaObjetos.add(new ObjetoFechaValor(LocalDate.of(2024, 3, 12), 200.0));
    listaObjetos.add(new ObjetoFechaValor(LocalDate.of(2024, 3, 13), 250.0));
    listaObjetos.add(new ObjetoFechaValor(LocalDate.of(2024, 3, 21), 1.0));
    listaObjetos.add(new ObjetoFechaValor(LocalDate.of(2024, 3, 15), 250.0));



     Map<String, List<ObjetoFechaValor>> groupedByYearMonth = listaObjetos.stream()
    .collect(Collectors.groupingBy(ObjetoFechaValor::getYear));
    log.info(groupedByYearMonth.toString());


    List<ObjetoFechaValor> listaReturn = groupedByYearMonth.entrySet().stream()
     .flatMap(entry -> entry.getValue().stream().map(
       x-> new ObjetoFechaValor()
     )
     )
     .collect(Collectors.toList());

     log.info(listaReturn.toString());
     return listaReturn;
}

}