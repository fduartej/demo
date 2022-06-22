package com.pattern.facade.concrete;

import com.pattern.facade.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
       System.out.println("Square::draw()");
    }
}
