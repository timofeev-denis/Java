package ru.code4fun.yandex;

public class Application {
    public static void main(String[] args) {

        Currency rur = Currency.RUR;
        Currency x = rur;

        System.out.println(x == Currency.RUR);
    }
}
