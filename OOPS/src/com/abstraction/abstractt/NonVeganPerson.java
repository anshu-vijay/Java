package com.abstraction.abstractt;

public class NonVeganPerson extends PersonAbstract {

	@Override
	public void eats() {
		System.out.println("Eats non vegan food.");
	}

}
