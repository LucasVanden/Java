package com.example.javaspringmaven.patterns.decorator;

public class UpperCasePrinterDecorator extends PrinterDecorator {
    public UpperCasePrinterDecorator(Printer printer) {
        super(printer);
    }
    @Override
    public void print(String msg) {
        String s = msg.toUpperCase();
        this.printer.print(s);
    }
}