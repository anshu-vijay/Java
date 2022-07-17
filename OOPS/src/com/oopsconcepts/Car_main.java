package com.oopsconcepts;

public class Car_main {

	public static void main(String[] args) {
		Car_pojo car = new Car_pojo();
		System.out.println(car.toString());
		Car_pojo car2 = new Car_pojo("Seated", "Closed");	
		
		System.out.println("Tyres : " + car2.getTyres());
		System.out.println("Driver : " + car2.getDriver());
		System.out.println("Doors : " + car2.getDoors());
		car2.run();
		
	}
	
	/*
	 * output 
	 * Car_pojo [tyres=4, driver=absent, doors=opened]
	 * Tyres : 4 
	 * Driver : Seated 
	 * Doors : Closed 
	 * Car is running
	 */
}
