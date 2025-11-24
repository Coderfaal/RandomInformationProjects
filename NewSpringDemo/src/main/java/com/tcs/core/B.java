package com.tcs.core;

public class B {
    A1 a;
    B(){
        this.a=a;
    }
    public String useMethod(){
       // A1 a = new A1();
        return a.method();
    }
}
