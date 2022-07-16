package com.sample;

public class SwitchCase {

	public static void main(String[] args) {
		int x = 2; //only int,string and enum are allowed to be used in switch
		switch(x) {
		case 1: System.out.println("one");
		break;
		case 2: System.out.println("two");
		break;
		case 3: System.out.println("three");
		break;
		default: System.out.println("Byeeee....");
		/*Output
		  two
		  */
		}
	}

}
