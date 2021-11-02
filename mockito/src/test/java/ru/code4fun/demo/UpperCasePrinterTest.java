package ru.code4fun.demo;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

class UpperCasePrinterTest {
    private UpperCasePrinter printer = new UpperCasePrinter();

    @Test
    void printUpperCaseCallsConvertToUpperCase() {
        UpperCasePrinter spyPrinter = spy(printer);

        spyPrinter.printUpperCase("test string");

        verify(spyPrinter).convertToUpperCase(eq("test string"));
    }
}
