package com.generics;

public class Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T newItem) {
        item = newItem;
    }

    public static String sum(Box<? extends String> left, Box right) {
        return left.getItem() + " - " + right.getItem();
    }

    public <T, S, U> T someFunc(S left, U right) {
        T item = (T) left;
        return item;
      //  return left + right;
    }
}
