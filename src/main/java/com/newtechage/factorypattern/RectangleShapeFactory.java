package com.newtechage.factorypattern;

public class RectangleShapeFactory extends ShapeFactory {
    @Override
    protected Shape getInstance() {
        return new RectangleShape();
    }
}
