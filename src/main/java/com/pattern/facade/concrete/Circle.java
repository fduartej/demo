package com.pattern.facade.concrete;

import com.pattern.facade.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
       System.out.println("Circle::draw()");
    }
}
