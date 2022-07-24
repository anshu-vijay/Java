package com.sample.linkedlist;

import java.util.LinkedList;

import com.sample.arraylist.ArrayListMethods;

public class Soluion {

	public static void main(String[] args) {
		//Used to manipulate data
		LinkedList<String> carsList = new LinkedList<String>();
		carsList.add("Volvo");
		carsList.add("BMW");
		carsList.add("Ford");
		carsList.add("Mazda");
		
		LinkedLinkMethods method = new LinkedLinkMethods();
		method.display(carsList); // [Volvo, BMW, Ford, Mazda]
		method.printFirstElement(carsList);	//Volvo
		method.displayLastOccurence(carsList, "BMW");	//1
		method.isEmpty(carsList);	//No, list contains few items
	}

}
