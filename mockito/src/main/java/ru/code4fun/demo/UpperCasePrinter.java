package ru.code4fun.demo;

public class UpperCasePrinter {
    public void printUpperCase(String string) {
        System.out.println(convertToUpperCase(string));
    }

    String convertToUpperCase(String string) {
        return string.toUpperCase();
    }
}
