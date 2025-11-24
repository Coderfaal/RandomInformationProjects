package com.tcs.geometry;

public class Mesuration {

    Shape shape;    //dependency

    public Mesuration() {
    }

    public Mesuration(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        System.out.println("from set()");
        this.shape = shape;
    }

    public double callArea(){
        return shape.area();
    }
    public double callPerimeter(){
        return shape.perimeter();

    }
}
