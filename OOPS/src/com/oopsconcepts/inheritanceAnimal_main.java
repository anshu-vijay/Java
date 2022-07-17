package com.oopsconcepts;

import com.inheritanceChild.Cat;
import com.inheritanceChild.Dog;
import com.inheritanceParent.Animal;

public class inheritanceAnimal_main {

	public static void main(String[] args) {
		Animal d = new Dog();
		Dog d1 = new Dog();
		Animal c = new Cat();
		//Dog a1 = new Animal();		Not Allowed
		//Cat a2 = new Animal();		Not Allowed
		Cat c1 = new Cat();
		
		d.eating("Buggu");		
		System.out.println(d.getEat());
		
		c.eating("Kitty");	
		System.out.println(c.getEat());
	}
	/*
	 * output 
	 * Buggu is eating.Fish 
	 * Kitty is eating.Fish
	 */
}
