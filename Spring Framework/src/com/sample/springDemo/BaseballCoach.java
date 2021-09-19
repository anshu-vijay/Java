package com.sample.springDemo;

public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "BaseBallCoach : Practice batting";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Baseball: Lucky Day" ;
	}
}
