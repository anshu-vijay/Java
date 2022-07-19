package com.sample.concepts;

public class MethodPrameters {

	public static void main(String[] args) {
		
		double length = 3.0;
		double width = 5.0;
		rectangleArea1(length,width);
		double area = rectangleArea2(4.0,6.0);
		System.out.println("Area from main coming from rectangleArea2 : " + area);
		//Area from main coming from rectangleArea2 : 24.0
	}

	public static void rectangleArea1(double length, double width) {		
		System.out.println("Area from rectangleArea1 : " +  length * width);
		//Area from rectangleArea1 : 15.0
	}
	
	public static double rectangleArea2(double length, double width) {		
		return (length * width);
	}

}
