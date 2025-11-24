package com.tcs.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAB {

    public static void main(String[] args) {
//        B b= new B();
//        System.out.println(b.useMethod());
        //bootstrap IOC Container
       ClassPathXmlApplicationContext context=
               new ClassPathXmlApplicationContext("beans.xml");
       if (context.containsBean("a"))
       {
           A a=(A) context.getBean("a");
           System.out.println(a.method());
       }
           if(context.containsBean("b"))
           {
               B b = (B) context.getBean("b");
               System.out.println(b.useMethod());
           }
       }
    }

