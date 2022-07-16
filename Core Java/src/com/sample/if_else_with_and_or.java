package com.sample;

public class if_else_with_and_or {

	public static void main(String[] args) {
		int x = 5;
		String y = "World";
		if(x==50 || y.equals("World")) {
			System.out.println("Hello 50!!");
		}
		else {
			System.out.println("Bye 1");
		}
		if (y.equals("World") && x==5){
			System.out.println("Hello 5!!");
		}
		else {
			System.out.println("Bye 2");
		}
	}

}
