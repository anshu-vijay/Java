package com.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {

	public static void main(String[] args) throws FileNotFoundException {
		method1();
		method2();		//throws FileNotFoundException should be added with Class
		}
	
	public static void method1()
	{
		try {
			FileReader file = new FileReader("file.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e); 	//java.io.FileNotFoundException: file.txt (The system cannot find the file specified)
		}
	}
	
	public static void method2() throws FileNotFoundException
	{
		FileReader file = new FileReader("file.txt");
		//Exception in thread "main" java.io.FileNotFoundException: file.txt (The system cannot find the file specified)
	}
}
