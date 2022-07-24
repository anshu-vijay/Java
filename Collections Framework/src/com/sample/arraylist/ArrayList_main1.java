package com.sample.arraylist;

import java.util.ArrayList;

public class ArrayList_main1 {

	public static void main(String[] args) {

		ArrayList<String> carsList = new ArrayList<String>();
		carsList.add("Volvo");
		carsList.add("BMW");
		carsList.add("Ford");
		carsList.add("Mazda");

		ArrayListMethods method = new ArrayListMethods();
		method.display(carsList); // [Volvo, BMW, Ford, Mazda]
		method.printFirstElement(carsList);	//Volvo
		method.displayLastOccurence(carsList, "BMW");	//1
		method.isEmpty(carsList);	//No, list contains few items
	}

}
