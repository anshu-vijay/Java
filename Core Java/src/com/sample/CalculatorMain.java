package com.sample;

public class CalculatorMain {

	public static void main(String[] args) {
		int num1 = 5,num2 = 9;
		double value1 = 3.6, value2 = 6.1;
		Calculator op = new Calculator();
		System.out.println("int addition : " + op.add(num1, num2));
		System.out.println("double addition : " + op.add(value1, value2));
		System.out.println("int subtraction : " + op.subtract(num1, num2));
		System.out.println("double subtraction : " + op.subtract(value1, value2));
		
		/*OUTPUT 
		 * int addition : 14 
		 * double addition : 9.7 
		 * int subtraction : -4 double
		 * subtraction : -2.4999999999999996
		 */
		
	}

}
