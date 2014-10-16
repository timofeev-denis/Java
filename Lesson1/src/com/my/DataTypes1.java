package com.my;

import com.oop.Animal;

class Example {
    static int number;
    Example(int number) {
        this.number = number;
    }
    int getNumber() {
        return number;
    }
}
class Derived extends Example {
    Derived() {
        this(10);
    }
    Derived(int number) {
        super(number);
    }
    @Override
    int getNumber() {
        return 100;
    }
}
class A {
    static int m() {
        return 1;
    }
}
class B extends A {
    static int m() {
        return 2;
    }
}
class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Class " + getName();
    }
}
public class DataTypes1 {
    public static void main(String[] args) {
        /*
        A a = new A();
        System.out.println(a.m());
        a = new B();
        System.out.println(a.m());

        Example e = new Example(3);
        System.out.println(e.getNumber());

        e = new Derived();
        //Derived d = (Derived) e;
        System.out.println(e.getNumber());
        */
        /*
        // ClassCastException
        String text = "";
        Object obj = text;
        Number num = (Number) obj;
        */
        /*
        Mammal monkey = new Mammal("Monkey");
        System.out.println( monkey.getName() );
        Animal a = new Animal("some name");
        System.out.println( a.getName() );
        */
    }
}
