package com.sample.springDemo;

public class MyApp {

	public static void main(String[] args) {
		Coach theBaseBallCoach = new BaseballCoach();
		System.out.println(theBaseBallCoach.getDailyWorkout());		
		Coach theTrackCoach = new TrackCoach();
		System.out.println(theTrackCoach.getDailyWorkout());
	}

}
