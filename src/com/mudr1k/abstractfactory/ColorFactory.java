package com.mudr1k.abstractfactory;

public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public Color create(String colorType) {
        if ("White".equalsIgnoreCase(colorType)) {
            return new White();
        } else if ("Black".equalsIgnoreCase(colorType)) {
            return new Black();
        } else if ("Brown".equalsIgnoreCase(colorType)) {
            return new Brown();
        }
        return null;
    }
}
