package com.infotech.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		// Dependancy injection used here because new Triangle(); not used
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/spring.xml");
	    
		Triangle objA = (Triangle) context.getBean("triangle");
		
	      objA.setMessage("I'm object A");
	      objA.getMessage();

	      Triangle objB = (Triangle) context.getBean("triangle");
	      objB.getMessage();
	}
}
