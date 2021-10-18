package com.mudr1k.abstractfactory;

public class Duck implements Animal {
    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "quack-quack";
    }
}
