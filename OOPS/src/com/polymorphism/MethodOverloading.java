package com.polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		area(5.0);
		area(3);
		area(3.0, 5.0);
		
	}
	
	public static void area(double side) {
		System.out.println("Area of square with double as datatype : " + side * side);
		//Area of square with double as datatype : 25.0
	}

	public static void area(int side) {
		System.out.println("Area of square with int as datatype: " + side * side);
		//Area of square with int as datatype: 9
	}

	public static void area(double length, double width) {
		System.out.println("Area of rectangle : " + length * width);
		//Area of rectangle : 15.0
	}

}
