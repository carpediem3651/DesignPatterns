package com.designpatterns.designpatterns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.designpatterns.designpatterns.proxy.Printable;
import com.designpatterns.designpatterns.proxy.Printer;
import com.designpatterns.designpatterns.proxy.PrinterProxy;

public class ProxyTest {
    
    @Test
    public void printerTest() {
        Printable printer = new PrinterProxy("samsung");
        String message = "첫 번째 출력입니다.";
        String printedChars = printer.print(message);

        String expected = "<samsung>" + message + "</samsung>";
        assertEquals(expected, printedChars);
    }
}
