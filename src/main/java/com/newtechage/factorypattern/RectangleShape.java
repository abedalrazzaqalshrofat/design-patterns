package com.newtechage.factorypattern;

public class RectangleShape implements Shape {
    @Override
    public void drawing() {
        System.out.println(getClass().getSimpleName());
    }
}
