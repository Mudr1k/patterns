package com.mudr1k.abstractfactory;

public class Dog implements Animal {
    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "bow-vow";
    }
}
