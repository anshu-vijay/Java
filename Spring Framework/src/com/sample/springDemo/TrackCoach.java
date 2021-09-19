package com.sample.springDemo;

public class TrackCoach implements Coach {
	// define a private field for the dependency
	private FortuneService fortuneservice;

	// define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneservice) {
		fortuneservice = theFortuneservice;
	}

	public TrackCoach() {		
	}

	@Override
	public String getDailyWorkout() {

		return "TrackCoach : Run 500 meter";
	}

	@Override
	public String getDailyFortune() {
		return "Track Coach: " + fortuneservice.getFortune();
	}
	
	//add an init method
	public void startUp() {
		System.out.println("Trackcoach: Starting bean scope lifecycle.");
	}
	//add a destroy method
	public void cleanUp() {
		System.out.println("Trackcoach: Destroying bean scope lifecycle.");
	}
}
