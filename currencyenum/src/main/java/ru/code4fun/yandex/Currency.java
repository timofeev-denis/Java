package ru.code4fun.yandex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Currency {

    public static final Currency RUR;
    public static final Currency USD;

    private static Map<Integer, Currency> values;
    private Integer code;
    private String name;

    static {
        values = new HashMap<Integer, Currency>();
        RUR = new Currency("RUR", 0);
        USD = new Currency("USD", 1);
    }

    public Currency(String name, Integer code) {
        this.code  = code;
        this.name = name;
        values.put(code, this);
    }

    public String name() {
        return name;
    }

    public static Currency getByOrdinal(Integer ordinal) {
        return values.get(ordinal);
    }

    public static Collection<Currency> getAll() {
        return values.values();
    }
}
