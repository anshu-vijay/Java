package com.sample;

public class SwitchCase_char_Aa {

	public static void main(String[] args) {
		char x = 'A';
		switch(x) {
		case 'a': System.out.println("LowerCase");
		break;
		case 'A': System.out.println("UpperCase");
		break;
		default: System.out.println("Undefined");
		}
		//Output - UpperCase
	}
}
