package com.mudr1k.abstractfactory;

public interface AbstractFactory<T> {
    T create(String type);
}
