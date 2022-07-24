package com.sample.arraylist;

import java.util.ArrayList;


public class main {

	
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);	//[Volvo, BMW, Ford, Mazda]
	    System.out.println(cars.get(1));	//BMW
	}

}
