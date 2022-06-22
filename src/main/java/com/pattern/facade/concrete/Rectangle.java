package com.pattern.facade.concrete;

import com.pattern.facade.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
       System.out.println("Rectangle::draw()");
    }
}
