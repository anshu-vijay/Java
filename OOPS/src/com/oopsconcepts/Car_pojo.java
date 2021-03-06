package com.oopsconcepts;

public class Car_pojo {
	private final int tyres = 4;
	private String driver;
	private String doors;
	
	public Car_pojo() {
		//super();
		this.driver = "absent";
		this.doors = "opened";
	}

	public Car_pojo(String driver, String doors) {
		//super();
		this.driver = driver;
		this.doors = doors;
	}

	@Override
	public String toString() {
		return "Car_pojo [tyres=" + tyres + ", driver=" + driver + ", doors=" + doors + "]";
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}


	public int getTyres() {
		return tyres;
	}

	public void run() {
		if (doors.equals("Closed") && driver.equals("Seated")) {
			System.out.println("Car is running");
		} else {
			System.out.println("Car is not running");
		}
	}
}
