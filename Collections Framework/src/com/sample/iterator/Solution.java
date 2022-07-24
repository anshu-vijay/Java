package com.sample.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Solution {

	public static void main(String[] args) {
		LinkedList<String> carsList = new LinkedList<String>();
		carsList.add("Volvo");
		carsList.add("BMW");
		carsList.add("Ford");
		carsList.add("Mazda");
		
		Iterator<String> itr = carsList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ListIterator<String> itr2 = carsList.listIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

//	Volvo
//	BMW
//	Ford
//	Mazda

}
