package com.exceptionHandling;

import java.io.FileNotFoundException;

public class UserDefined {

	public static void main(String[] args) throws FileNotFoundException {
		int x = 1;

		try {
			method();
		} catch (FileNotFoundException e) {
			System.out.println("*************File not Found************");
		}catch (UserDefinedException e) {
			System.out.println("*********UserDefinedException class************");
		}


		catch (Exception e) {
			System.out.println("*********Excepion Mother class************");
		}

	}

	public static void method() throws FileNotFoundException, UserDefinedException {
		int x = 2; 
		switch(x) {
		case 1 : throw new FileNotFoundException();
		case 2 : throw new UserDefinedException();
//		output
//		*********UserDefinedException class************
	}
	
	}

}

class UserDefinedException extends Throwable{
	//IF we use throwable then handling the exception becomes compulsary
}

/*
 * class UserDefinedException extends Exception{
 * If we use Exception then handling the exception becomes optional
 * }
 */
