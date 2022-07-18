package com.polymorphism;

public class Polymorphism {

	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11)); // 22
		System.out.println(Adder.add(11, 11, 11)); // 33

		Vehicle v = new Vehicle();
		v.run();// Bike is running safely
		Vehicle b = new Bike();
		b.run();// Bike is running safely
		Vehicle c = new Car();
		c.run();// Car is running safely
	}

}
