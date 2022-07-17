package com.oopsconcepts;

public class Car_main {

	public static void main(String[] args) {
		Car_pojo car = new Car_pojo();
		car.setDoors("Closed");
		car.setDriver("Sitted");
		System.out.println("Tyres : " + car.getTyres());
		System.out.println("Driver : " + car.getDriver());
		System.out.println("Doors : " + car.getDoors());
	}
	/*
	 * output 
	 * Tyres : 4 
	 * Driver : Sitted
	 * Doors : Closed
	 */}
