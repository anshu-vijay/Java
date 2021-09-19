package com.sample.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeApp {

	public static void main(String[] args) {
		//loading spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);	
		Coach theCoach2 = context.getBean("myCoach",Coach.class);	
		//check if they are sam beans
		boolean result = (theCoach == theCoach2);
		//print out the results
		System.out.println("Are they pointing to same bean: " + result);
		System.out.println("Memory Location of theCoach: " + theCoach);
		System.out.println("Memory Location of theCoach2: " + theCoach2);

	}

}
