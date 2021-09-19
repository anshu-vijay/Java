package com.sample.springDemo;

public class BaseballCoach implements Coach {
	// define a private field for the dependency
	private FortuneService fortuneservice;

	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneservice) {
			fortuneservice = theFortuneservice;
		}

	@Override
	public String getDailyWorkout() {
		return "BaseBallCoach : Practice batting";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Baseball: " + fortuneservice.getFortune();
	}
}
