package com.sample.localInnerClass;



public class Shop {
	public static void main(String[] args) {
		Door door = new Door();
		boolean status = door.isLocked("test");
		if (status == false) {		//false means door is not locked
			System.out.println("opened");
		}
		else {
			System.out.println("closed");
		}
	}
}
//output
//closed