package com.newtechage;

import com.newtechage.factorypattern.RectangleShapeFactory;
import com.newtechage.factorypattern.Shape;
import com.newtechage.factorypattern.ShapeFactory;

public class App {
    public static void main( String[] args ) {

        ShapeFactory shapeFactory = new RectangleShapeFactory();

        Shape shape = shapeFactory.factory();
        shape.drawing();

    }
}
