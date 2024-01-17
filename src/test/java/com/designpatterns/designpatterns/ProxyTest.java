package com.designpatterns.designpatterns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.designpatterns.designpatterns.proxy.Aspect;
import com.designpatterns.designpatterns.proxy.Logging;
import com.designpatterns.designpatterns.proxy.Printable;
import com.designpatterns.designpatterns.proxy.Printer;
import com.designpatterns.designpatterns.proxy.PrinterProxy;
import com.designpatterns.designpatterns.proxy.UserAuth;

public class ProxyTest {
    Aspect logging = new Logging();
    Aspect userAuth = new UserAuth();

    @Test
    public void printerTest() {
        Printable printer = new PrinterProxy("samsung", logging, userAuth);
        String message = "첫 번째 출력입니다.";
        String printedChars = printer.print(message);

        String expected = "<samsung>" + message + "</samsung>";
        assertEquals(expected, printedChars);
    }
}
