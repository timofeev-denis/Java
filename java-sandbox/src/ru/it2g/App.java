package ru.it2g;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by timofeevdv on 21.04.2016.
 */
public class App {

    public static void main(String[] args) {

        TestFI2 testFI2 = () -> { return "222"; };
        System.out.println(testFI2.Get());

    }

    private static void printNames(String name) {
        System.out.println(name);
    }

    private static void printName2(String name) {
        System.out.println(name);
    }

    private static String printName2() {
        return "retunr";
    }

    class Test{

    }
}

@FunctionalInterface
interface TestFI{
    void Set(String s, String s2);
}

@FunctionalInterface
interface TestFI2{
    String Get();
}


