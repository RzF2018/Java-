package PrototypePattern.Shape.extend;

import PrototypePattern.Shape.Shape;

public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Square draw().method");
    }
}
