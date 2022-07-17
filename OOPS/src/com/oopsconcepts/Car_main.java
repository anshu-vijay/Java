package com.oopsconcepts;

public class Car_main {

	public static void main(String[] args) {
		Car_pojo car = new Car_pojo();
		car.run();  //using constructor values where no property has been defined
		car.setDoors("Closed");
		car.setDriver("Seated");
		System.out.println("Tyres : " + car.getTyres());
		System.out.println("Driver : " + car.getDriver());
		System.out.println("Doors : " + car.getDoors());
		car.run();	//using setter values 
	}
	/*
	 * output 
	 	Car is not running
		Tyres : 4
		Driver : Seated
		Doors : Closed
		Car is running
	 */}
