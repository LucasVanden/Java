package com.example.javaspringmaven.patterns.decorator;

public class DecoratorUse {

    public void use(String input){

        Printer simplePrinter = new SimplePrinter();
		boolean upercase = true;
		boolean addAsterisk = true;

				if (upercase){
					simplePrinter = new UpperCasePrinterDecorator(simplePrinter);
				}
				if(addAsterisk){
					simplePrinter = new AddAsterisksPrinterDecorator(simplePrinter);
				}
				
				simplePrinter.print(input);
    }
}
