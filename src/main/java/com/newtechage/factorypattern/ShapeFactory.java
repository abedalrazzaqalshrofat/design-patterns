package com.newtechage.factorypattern;

public abstract class ShapeFactory {


    public Shape factory(){
        return getInstance();
    }

    protected abstract Shape getInstance();
}
