package com.example.javaspringmaven.patterns.decorator;

abstract class PrinterDecorator implements Printer {
    protected Printer printer;
    public PrinterDecorator(Printer printer) {
        this.printer = printer;
    }
}