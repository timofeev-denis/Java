package com.oop;

public class Animal {
    private String className;
    public Animal(String name) {
        className = name;
    }
    public String getName() {
        return className;
    }
    public void setName(String newName) {
        this.className = newName;
    }

}

