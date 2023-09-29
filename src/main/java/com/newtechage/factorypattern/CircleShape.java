package com.newtechage.factorypattern;

public class CircleShape implements Shape{
    @Override
    public void drawing() {
        System.out.println(getClass().getSimpleName() + "v1");
    }
}
