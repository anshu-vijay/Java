package com.sample.springAnnotationDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeMainClass {

	public static void main(String[] args) {
		//read spring config file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
				//get the bean from spring container
				Coach theCoach = context.getBean("tennisCoach",Coach.class);
				Coach theAlphaCoach = context.getBean("tennisCoach",Coach.class);
				
				//check if they are same
				boolean result = (theCoach == theAlphaCoach);
				System.out.println("Pointing to same object: "+result);
				System.out.println("Memory Location theCoach: "+theCoach);
				System.out.println("Memory Location theAlphaCoach: "+theAlphaCoach);
				//Here we will get to know that default scope is singleton
				//close the context
				context.close();
			}

	}


