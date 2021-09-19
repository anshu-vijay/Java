package com.sample.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterCricketMainClass {

	public static void main(String[] args) {
		//loading spring configuration file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				//retrieve bean from spring container
				CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);						
				//call methods from beans
				System.out.println(theCoach.getDailyWorkout());
				//calling new method with setter injection
				System.out.println(theCoach.getDailyFortune());	
				//calling new method with literal injection
				System.out.println(theCoach.getFullname());
				System.out.println(theCoach.getDept());
				//close context
				context.close();
	}

}
