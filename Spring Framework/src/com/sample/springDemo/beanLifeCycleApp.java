package com.sample.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifeCycleApp {

	public static void main(String[] args) {
		//loading spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();

	}

}
