package com.sample.linkedlist;

import java.util.LinkedList;

public class LinkedLinkMethods {
	public void display(LinkedList<String> carsList) {
		System.out.println(carsList);	//[Volvo, BMW, Ford, Mazda]
	}
	
	public void displayLastOccurence(LinkedList<String> carsList, String carName) {
		System.out.println(carsList.lastIndexOf(carName));	//1
	}
	
	public void isEmpty(LinkedList<String> carsList) {
		if (carsList.isEmpty()) {
			System.out.println("Yes, the list is empty");
		}
		System.out.println("No, list contains few items");	
	}
	
	public void printFirstElement(LinkedList<String> carsList) {
		System.out.println(carsList.get(0));	//1
	}

	public void newEntry(LinkedList<String> carsList,int index, String newName) {
		carsList.add(index, newName);
		System.out.println(carsList); 	//[Volvo, BMW, Creta, Ford, Mazda]
		carsList.addFirst("Honda City");
		System.out.println(carsList); 	//[Honda City, Volvo, BMW, Creta, Ford, Mazda]
		
	}
}
