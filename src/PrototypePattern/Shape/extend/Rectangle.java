package PrototypePattern.Shape.extend;

import PrototypePattern.Shape.Shape;

public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw(){
        System.out.println("Rectangle draw().method");
    }
}
