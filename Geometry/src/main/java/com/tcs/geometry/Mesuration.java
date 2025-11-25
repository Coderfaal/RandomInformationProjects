package com.tcs.geometry;

public class Mesuration {

    Shape shape;    //dependency

    public Mesuration() {
        System.out.println("this is from Default Constructor of Mensuration()");
    }
    public Mesuration(Rectangle rect){
    //public Mesuration(Shape shape) {
        System.out.println("this is from  of Mensuration()");
        this.shape = rect;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        System.out.println("from set() of Mensuration()");
        this.shape = shape;
    }

    public double callArea(){
        return shape.area();
    }
    public double callPerimeter(){
        System.out.println("From Rectangle Perimeter");
        return shape.perimeter();


    }
    public  void myInit(){
        System.out.println("from init()");
    }
    public void myDestory(){
        System.out.println("from destory()");
    }
}
