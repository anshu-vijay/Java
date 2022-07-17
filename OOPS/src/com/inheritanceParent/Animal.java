package com.inheritanceParent;

public class Animal {
	private String eat = "Fish";

	public String getEat() {
		return eat;
	}

	public void eating(String animalType) {
		System.out.print(animalType + " is eating.");
	}

}
