package com.spring.post;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cornelia on 10/11/17.
 */
public class MainApp {
    public static void main(String args[]){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld2");
        obj.getMessage();
        context.registerShutdownHook();
    }
}
