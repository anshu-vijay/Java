package com.sample.concepts;

public class DoWhileLoop {

	public static void main(String[] args) {
		int x = 5;
		do {
			System.out.println(x);
			--x;
		} while (x > 3);
	}
	/*output
	 5
	 4
	 */
}
