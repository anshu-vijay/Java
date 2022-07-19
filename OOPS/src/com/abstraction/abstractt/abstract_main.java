package com.abstraction.abstractt;

public class abstract_main {

	public static void main(String[] args) {
		PersonAbstract tom = new VeganPerson();
		tom.speaks();	//Shares his/her thoughts
		tom.eats();		//Eats vegan food.
		
		PersonAbstract jerry = new NonVeganPerson();
		jerry.speaks();		//Shares his/her thoughts
		jerry.eats();		//Eats non vegan food.
	}

}
