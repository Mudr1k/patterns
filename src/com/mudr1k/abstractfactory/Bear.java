package com.mudr1k.abstractfactory;

public class Bear implements Animal {
    @Override
    public String getAnimal() {
        return "Bear";
    }

    @Override
    public String makeSound() {
        return "gr-gr-gr";
    }
}
