package ru.code4fun.yandex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyTest {

    @Test
    void comapareByNameTest() {
        assertTrue(Currency.RUR.name().equals("RUR"));
    }

    @Test
    void compareUsingEqualsSignsTest() {
        Currency rur = Currency.RUR;
        Currency usd = Currency.USD;

        assertTrue(rur == Currency.RUR);
        assertFalse(rur == Currency.USD);
        assertFalse(rur == usd);
    }

    @Test
    void getAllTest() {
        System.out.println(Currency.getAll());
    }

    @Test
    void getByOrdinalTest() {
        System.out.println(Currency.getByOrdinal(0));

    }
}