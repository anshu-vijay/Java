package com.sample.springDemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "TrackCoach : Run 500 meter";
	}

}
