package com.sample.concepts;

public class If_else_decision_making {

	public static void main(String[] args) {
		int x = 5;
		String y = "World";
		if(x==5) {
			System.out.println("Hello 5!!");
		}
		else if (y.equals("My world")){
			System.out.println("Hello " + y );
		}
		else {
			System.out.println("Bye");
		}
	}

}
