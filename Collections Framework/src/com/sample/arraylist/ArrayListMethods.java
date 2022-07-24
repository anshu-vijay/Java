package com.sample.arraylist;

import java.util.ArrayList;

public class ArrayListMethods {
	public void display(ArrayList<String> carsList) {
		System.out.println(carsList);	//[Volvo, BMW, Ford, Mazda]
	}
	
	public void displayLastOccurence(ArrayList<String> carsList, String carName) {
		System.out.println(carsList.lastIndexOf(carName));	//1
	}
	
	public void isEmpty(ArrayList<String> carsList) {
		if (carsList.isEmpty()) {
			System.out.println("Yes, the list is empty");
		}
		System.out.println("No, list contains few items");	
	}
}
