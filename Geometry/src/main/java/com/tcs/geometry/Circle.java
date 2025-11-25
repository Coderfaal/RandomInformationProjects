package com.tcs.geometry;

public class Circle implements Shape{
    private double radius;

    public Circle() {

    }

    @Override
    public double area() {
    return Math.PI *(radius*radius);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double perimeter(){
        return Math.PI *(radius*radius);
    }

}
