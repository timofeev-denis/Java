package com.generics;

public class App {
    public static void main(String[] args) {
        Box<Integer> i = new Box<>();
        i.setItem(new Integer(5));

        Box<String> s = new Box<String>();
        s.setItem("TEST");

        System.out.println( Box.sum(s, i) );
    }
}
