package com.exceptionHandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		try {
			int x = 10 / 0;
			System.out.println("This statement will not get executed."); // This statement will not get executed.
		} catch (ArithmeticException e) {
			System.out.println(e); // java.lang.ArithmeticException: / by zero
		} catch (Exception e) {
			System.out.println(e); // java.lang.ArithmeticException: / by zero
		}
	}
}
