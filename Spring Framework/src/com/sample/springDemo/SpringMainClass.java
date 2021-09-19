package com.sample.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainClass {

	public static void main(String[] args) {
		//loading spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("baseBallCoach",Coach.class);		
		Coach theCoach2 = context.getBean("trackCoach",Coach.class);
		//call methods from beans
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach2.getDailyWorkout());
		//close context
		context.close();
	}

}
