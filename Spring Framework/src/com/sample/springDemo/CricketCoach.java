package com.sample.springDemo;

public class CricketCoach implements Coach {
	
	
	private FortuneService fortuneservice;
	
	public CricketCoach() {
		System.out.println("Setter Method : we are inside constructor.");
	}
	
	//our setter method
	public void setFortuneservice(FortuneService fortuneservice) {
		System.out.println("Setter Method : we are inside setter method.");
		this.fortuneservice = fortuneservice;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Cricket Coach: Do Bowling";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "CricketCoach: " + fortuneservice.getFortune();
	}

}
