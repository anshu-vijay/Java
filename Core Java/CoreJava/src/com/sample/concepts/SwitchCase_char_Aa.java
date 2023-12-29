package com.sample.concepts;

public class SwitchCase_char_Aa {

	public static void main(String[] args) {
		char x = 'B';
		switch(x) {
		case 'A':
		case 'a': System.out.println(1);
		break;
		case 'B':
		case 'b': System.out.println(2);
		break;
		default: System.out.println("Undefined");
		}
		//Output - 2
	}
}
