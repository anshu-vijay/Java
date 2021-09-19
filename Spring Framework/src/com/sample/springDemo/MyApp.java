package com.sample.springDemo;

public class MyApp {

	public static void main(String[] args) {
		BaseballCoach theBaseBallCoach = new BaseballCoach();
		System.out.println(theBaseBallCoach.getDailyWorkout());		
		TrackCoach theTrackCoach = new TrackCoach();
		System.out.println(theTrackCoach.getDailyWorkout());
	}

}
