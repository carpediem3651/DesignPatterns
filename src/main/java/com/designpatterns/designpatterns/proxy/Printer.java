package com.designpatterns.designpatterns.proxy;

public class Printer implements Printable{

    private String printerName;

	public Printer(String printerName) {
        this.printerName = printerName;
	}

    public String print(String message) {
        String printedChar = "<" + printerName + ">" + message + "</" + printerName + ">";
        return printedChar;
    }

    
    
}
