package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBEanContext.xml");
        context.getBean("myBean");
        GettingServices gettingServices = (GettingServices) context.getBean("myBean");
        gettingServices.sayHello();
    }
}
