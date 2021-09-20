package com.sample.springAnnotationDemo;

import org.springframework.stereotype.Component;

@Component("theTennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Tennis Coach: Practice for 3 hours";
	}

}
