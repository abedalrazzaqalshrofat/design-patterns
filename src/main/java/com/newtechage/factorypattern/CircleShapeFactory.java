package com.newtechage.factorypattern;

public class CircleShapeFactory extends ShapeFactory {


    @Override
    protected Shape getInstance() {
        return new CircleShape();
    }
}
