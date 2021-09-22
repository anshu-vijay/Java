package com.sample.springAnnotationDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortune")
	private FortuneService fortuneService;

	// define a default constructor
	public TennisCoach() {
		System.out.println("Tennis Coach: Inside Default Constructor.");
	}

	// define my init method
	@PostConstruct
	public void startingMethod() {
		System.out.println("Calling PostContruct: before actual code starts.");
	}

	// define my destroy method
	@PreDestroy
	public void endingMethod() {
		System.out.println("Calling PreContruct: after actual code ends.");
	}
	// define a setter method
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println("Tennis Coach: Inside setFortuneService().");
//		fortuneService = theFortuneService;
//	}

	// define any random method
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
