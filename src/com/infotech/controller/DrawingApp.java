package com.infotech.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/spring.xml");
	    Triangle obj = (Triangle) context.getBean("triangle");
	    obj.getMessage();
	}
}
