package com.exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		/*
		 * If you are using finally lock then catch block is optional whether there is
		 * exception or not, finally block must gets executed
		 */
		
		try {
			int x = 10 / 0;
			System.out.println(x);		//This statement will not get executed.
		} catch (ArithmeticException e) {
			System.out.println(e); // java.lang.ArithmeticException: / by zero
		} catch (Exception e) {
			System.out.println(e); // java.lang.ArithmeticException: / by zero
		}finally {
			System.out.println("Finally Block");
		}
		
//		output
//		java.lang.ArithmeticException: / by zero
//		Finally Block
		
		try {
			int x = 10 / 2;
			System.out.println(x);
		} catch (ArithmeticException e) {
			System.out.println(e); // java.lang.ArithmeticException: / by zero
		} catch (Exception e) {
			System.out.println(e); // java.lang.ArithmeticException: / by zero
		}finally {
			System.out.println("Finally Block");
		}
		
//		output
//		5
//		Finally Block

	}

}
