package com.tcs.geometry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShape {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Mesuration m = (Mesuration) context.getBean("util");
        System.out.println(m.callArea());
        System.out.println(m.callPerimeter());
    }
}
