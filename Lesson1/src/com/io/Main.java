package com.io;

import java.io.*;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        try( Test t = new Test("break") ) {
            System.err.println("TRY SUCCEED");

            int x = 1;
            x++;
            System.err.println("x=" + x);
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

class Test implements AutoCloseable {
    private String name;

    public Test(String n) throws IOException {
        if( n.equals("break")) {
            throw new IOException( "create" );
        }
        name = "OK: " + n;
    }
    public void close() throws Exception {
        throw new Exception("close");
    }
}