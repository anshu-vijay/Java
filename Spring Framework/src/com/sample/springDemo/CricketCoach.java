package com.sample.springDemo;

public class CricketCoach implements Coach {
	
	
	private FortuneService fortuneservice;
	
	//add new field for fullname and dept
	private String fullname;
	private String dept;
	
	
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		System.out.println("Setter Method : we are inside fullname field.");
		this.fullname = fullname;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		System.out.println("Setter Method : we are inside department field.");
		this.dept = dept;
	}

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
