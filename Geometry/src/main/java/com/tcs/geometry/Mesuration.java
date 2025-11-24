package com.tcs.geometry;

public class Mesuration {

    Shape shape;    //dependency

    public Mesuration() {
    }

    public Mesuration(Shape shape) {
        this.shape = shape;
    }
    public double callArea(){
        return shape.area();
    }
    public double callPerimeter(){
        return shape.perimeter();

    }
}
