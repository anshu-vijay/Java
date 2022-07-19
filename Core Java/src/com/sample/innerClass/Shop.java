package com.sample.innerClass;

public class Shop {

	public static void main(String[] args) {
		Door door = new Door();
		door.shopStatus();		//Shop is closed
		door.getLock().setLockValue(false);
		door.shopStatus();		//Shop is opened
	}

}
