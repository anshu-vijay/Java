package com.sample.anonymousObject;

public class Shop {
	public static void main(String[] args) {
		// Door door = new Door();
		if (new Door().isLocked("test") == false) { // false means door is not locked
			System.out.println("opened");
		} else {
			System.out.println("closed");
		}
	}
}
//output
//closed