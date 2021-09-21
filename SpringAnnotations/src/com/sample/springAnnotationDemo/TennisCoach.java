package com.sample.springAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("sadDailyFortune")
	private FortuneService fortuneService;


	//define a default constructor
	public TennisCoach() {
		System.out.println("Tennis Coach: Inside Default Constructor.");
	}
	
	//define a setter method
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println("Tennis Coach: Inside setFortuneService().");
//		fortuneService = theFortuneService;
//	}
	
	//define any random method
//	@Autowired
//	public void randomMethod(FortuneService theFortuneService) {
//		System.out.println("Tennis Coach: Inside the randomly used method.");
//		fortuneService = theFortuneService;
//	}

	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

	
	@Override
	public String getDailyWorkout() {
		return "Tennis Coach: Practice for 3 hours";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
