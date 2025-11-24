package com.tcs.core;

public class B {
    A a;
    A1 a1;//this is a dependency spring can inject this
    B(A1 a1)
    {
        System.out.println("from B()");
        this.a1=a1;
    }
    public void setA(A a){
        this.a =a;
    }
    public String useMethod(){
       // A1 a = new A1();
        return a1.method() +"," + a.method();
    }
}
