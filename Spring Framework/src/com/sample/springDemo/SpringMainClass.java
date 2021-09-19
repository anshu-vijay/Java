package com.sample.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainClass {

	public static void main(String[] args) {
		//loading spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);		
		
		//call methods from beans
		System.out.println(theCoach.getDailyWorkout());
		//calling new method with constructor injection
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		context.close();
	}

}
