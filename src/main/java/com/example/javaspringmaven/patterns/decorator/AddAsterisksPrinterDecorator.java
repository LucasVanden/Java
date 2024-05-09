package com.example.javaspringmaven.patterns.decorator;

public class AddAsterisksPrinterDecorator extends PrinterDecorator {
    public AddAsterisksPrinterDecorator(Printer printer) {
        super(printer);
    }
    @Override
    public void print(String msg) {
        msg = "*** " + msg + " ***";
        this.printer.print(msg);
    }
}