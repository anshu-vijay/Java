package com.sample.enm;

public class main {

	public static void main(String[] args) {
		Weekdays day = Weekdays.Friday;
		System.out.println(day);
		switch(day) {
		case Monday: 
		case Tuesday:
		case Wednesday:
		case Thursday:			
			System.out.println("Wait for few more days");
			
		case Friday:
		case Saturday:
		case Sunday:
			System.out.println("Weekend is here");
		}

	}

}
