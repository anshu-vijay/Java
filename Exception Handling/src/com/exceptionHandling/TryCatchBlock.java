package com.exceptionHandling;

public class TryCatchBlock {
	public static void main(String args[]) {
		TryCatchBlock obj = new TryCatchBlock();
		obj.divide(10, 0);
	}

	public void divide(int x, int y) {
		System.out.println("*************using if else***********");
		if (y != 0) {
			System.out.println(x / y);
		} else {
			System.out.println("value of y cannot be 0");
		}
		System.out.println("*************using try catch***********");
		try {
			System.out.println(x / y);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	/*
	  output 
	  ************using if else*********** 
	  value of y cannot be 0 using 
	  *************try catch*********** 
	  java.lang.ArithmeticException: / by zero
	 */
}
