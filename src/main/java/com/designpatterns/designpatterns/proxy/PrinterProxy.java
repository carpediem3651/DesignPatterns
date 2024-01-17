package com.designpatterns.designpatterns.proxy;

import java.util.List;

public class PrinterProxy implements Printable{
    
    private String printerName;
    private List<Aspect> aspects;
        
    public PrinterProxy(String printerName, Aspect ...aspect) {
        this.printerName = printerName;
        this.aspects = List.of(aspect);
    }

    @Override
    public String print(String message) {
        Printer printer = new Printer(printerName);
        aspects.forEach(action -> action.before());
        String printedChars = printer.print(message);
        aspects.forEach(action -> action.after());
        return printedChars;
    }
}
