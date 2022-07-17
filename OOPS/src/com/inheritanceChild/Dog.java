package com.inheritanceChild;

import com.inheritanceParent.Animal;

public class Dog extends Animal {
	private String speak;

	public Dog() {
		super();
		this.speak = "Bark";
	}

	public void display() {
		System.out.println("Here is a Dog!! " + speak);
	}
}
