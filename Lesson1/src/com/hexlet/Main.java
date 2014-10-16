package com.hexlet;

import com.hexlet.common.Course;
import com.hexlet.humans.Student;

public class Main {
    public static void main(String[] args) {
        //System.out.println( "Hello World!" );
//        Student studentMax = new Student();
//        studentMax.name = "Max";
//        studentMax.course.name = "Java class";
//        studentMax.sayHello();
//
//        Student studentSlava = new Student();
//        studentSlava.sayHello();
        String someString = new String( "0123456" );
        char[] charArray = someString.toCharArray();
        System.out.println( someString );

        for (int i = charArray.length / 2 - 1; i >= 0; i--) {
            swap( charArray, i, charArray.length - 1 - i );
        }
        someString = new String( charArray );
        System.out.println( someString );
    }

    private static void swap( char[] array, int first, int second ) {
        char tmp = array[ first ];
        array[ first ] = array[ second ];
        array[ second ] = tmp;
    }

}
