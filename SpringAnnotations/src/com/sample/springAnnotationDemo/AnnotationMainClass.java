package com.sample.springAnnotationDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMainClass {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach theCoach = context.getBean("theTennisCoach",Coach.class);
		//call amethod on the bean
		System.out.println(theCoach.getDailyWorkout());
		//close the context
		context.close();
	}

}
