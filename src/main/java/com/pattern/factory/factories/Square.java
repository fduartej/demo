package com.pattern.factory.factories;

import com.pattern.factory.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
       System.out.println("Inside Square::draw() method.");
    }

}
