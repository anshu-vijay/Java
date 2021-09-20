package com.sample.springAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Tennis Coach: Practice for 3 hours";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
