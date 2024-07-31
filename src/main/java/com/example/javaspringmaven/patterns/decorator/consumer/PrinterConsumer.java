package com.example.javaspringmaven.patterns.decorator.consumer;

import reactor.core.publisher.Mono;

public class PrinterConsumer {
    SimplePrinter impresora = new SimplePrinter();
    UpercasePrinter uper = new UpercasePrinter();
    AsteriskPrinter aste = new AsteriskPrinter();

    void testear(String entrada){

       Mono<String> output = Mono.justOrEmpty(entrada)
        .map(input->uper.apply(input))
        .map(input->aste.apply(input));

        impresora.print(output.block());
        
        
    } 
}
