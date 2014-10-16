package ru.voskhod.junitmavenapp;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world");
        short a = 1;
        short b = 0;
        sum(a, b);
    }
    
    public static long sum(short a, short b) {
        if( a + b < 2 ) {
            throw new IllegalArgumentException("<2");
        }
        return a + b;
        
    }
}
