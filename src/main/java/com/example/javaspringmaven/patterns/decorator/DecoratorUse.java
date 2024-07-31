package com.example.javaspringmaven.patterns.decorator;

public class DecoratorUse {

    public void use(String input){

        Printer simplePrinter = new SimplePrinter();
		boolean uppercase = true;
		boolean addAsterisk = true;

				if (uppercase){
					simplePrinter = new UpperCasePrinterDecorator(simplePrinter);
				}
				if(addAsterisk){
					simplePrinter = new AddAsterisksPrinterDecorator(simplePrinter);
				}
				
				simplePrinter.print(input);
    }
}
