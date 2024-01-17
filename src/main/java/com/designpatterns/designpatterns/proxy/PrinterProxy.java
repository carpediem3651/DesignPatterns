package com.designpatterns.designpatterns.proxy;

public class PrinterProxy implements Printable{
    
    private String printerName;
        
    public PrinterProxy(String printerName) {
        this.printerName = printerName;
    }

    @Override
    public String print(String message) {
        Printer printer = new Printer(printerName);
        System.out.println("프린트 시작:" + System.nanoTime());
        String printedChars = printer.print(message);
        System.out.println("프린트 종료:" + System.nanoTime());
        return printedChars;
    }
}
