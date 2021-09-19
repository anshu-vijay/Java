package com.sample.springDemo;

public class BaseballCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "BaseBallCoach : Practice batting";
	}
}
