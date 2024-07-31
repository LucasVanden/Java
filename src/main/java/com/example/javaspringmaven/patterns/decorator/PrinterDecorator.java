package com.example.javaspringmaven.patterns.decorator;

abstract class PrinterDecorator implements Printer {
    protected Printer printer;
    PrinterDecorator(Printer printer) {
        this.printer = printer;
    }
}