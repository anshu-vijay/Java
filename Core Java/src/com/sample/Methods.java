package com.sample;

public class Methods {

	public static void main(String[] args) {
		display1();
		display2("Vijay");
	}

	public static void display1() {
		String firstname = "Anshu";
		System.out.println("Hello User, " + firstname);  	//Hello User, Anshu
	}

	public static void display2(String lastname) {
		System.out.println("Hello User, " + lastname); 		//Hello User, Vijay
	} 

}
