package com.inheritanceChild;

import com.inheritanceParent.Animal;

public class Cat extends Animal{
	private String speak;
	
	public Cat() {
		super();
		this.speak = "Meow";
	}
	
	public void display() {
		System.out.println("Here is a Cat!! " + speak);
	}
}
