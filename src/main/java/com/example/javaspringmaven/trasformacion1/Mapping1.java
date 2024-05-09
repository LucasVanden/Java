package com.example.javaspringmaven.trasformacion1;
import com.google.gson.Gson;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Mapping1 {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public List<YearMonthValue> trasformar() throws JsonProcessingException {
        // Supongamos que tienes una lista de objetos ObjetoFechaValor
        List<ObjetoFechaValor> listaObjetos = new ArrayList<>();

        // Llenamos la lista con datos de ejemplo

        listaObjetos.add(new ObjetoFechaValor(LocalDate.of(2023, 5, 12), 100.0));
        listaObjetos.add(new ObjetoFechaValor(LocalDate.of(2023, 6, 20), 150.0));
        listaObjetos.add(new ObjetoFechaValor(LocalDate.of(2024, 3, 12), 200.0));
        listaObjetos.add(new ObjetoFechaValor(LocalDate.of(2024, 3, 13), 250.0));
        listaObjetos.add(new ObjetoFechaValor(LocalDate.of(2024, 3, 21), 1.0));
        listaObjetos.add(new ObjetoFechaValor(LocalDate.of(2024, 3, 15), 250.0));


   List<ObjetoFechaValor> as = listaObjetos.stream()
         .collect(Collectors.groupingBy(
                ObjetoFechaValor::getYear,
                LinkedHashMap::new,
                Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(ObjetoFechaValor::getFecha)),
                        Optional::get)
        ))
        .values().stream()
        .collect(Collectors.toList());
log.info(as.toString());
        Optional<Object> va = listaObjetos.stream()
        .max(Comparator.comparing(ObjetoFechaValor::getFechaString))
        .map(el->el.getValor());

        // System.out.println(va.get());
        // Utilizamos Java Streams para transformar la lista
        List<YearMonthValue> resultado = listaObjetos.stream()
                .collect(Collectors.groupingBy(obj -> obj.getFecha().getYear()))
                .entrySet().stream().map(entry -> {

                    YearMonthValue yearMonthValue = new YearMonthValue(entry.getKey(), new ArrayList<>());
                    entry.getValue()
                            .forEach(obj -> yearMonthValue.getMonthValues()
                                .add(new MonthValue(
                                obj.getFecha().getMonthValue(),
                                obj.getValor())));

                    return yearMonthValue;
                })
                
                .collect(Collectors.toList());


                // log.info(objectMapper.writeValueAsString(resultado));

                return resultado;
    }
}
