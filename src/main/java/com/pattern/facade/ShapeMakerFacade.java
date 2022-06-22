package com.pattern.facade;

import com.pattern.facade.concrete.*;

public class ShapeMakerFacade {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMakerFacade() {
       circle = new Circle();
       rectangle = new Rectangle();
       square = new Square();
    }

    public void drawCircle(){
       circle.draw();
    }
    public void drawRectangle(){
       rectangle.draw();
    }
    public void drawSquare(){
       square.draw();
    }

}
