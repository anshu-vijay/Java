package com.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowClass {

	public static void main(String[] args) {
		method1();
		}
	
	public static void method1()
	{
		try {
			System.out.println("Inside try block");
			throw new FileNotFoundException();
		} catch (Exception e) {
			System.out.println(e); 	
		}
	}
//	output
//	Inside try block
//	java.io.FileNotFoundException

}
