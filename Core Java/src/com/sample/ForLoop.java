package com.sample;

public class ForLoop {

	public static void main(String[] args) {
		int i;
		for (i = 1 ; i <= 5 ; i++) {
			System.out.println(i);
			/*output
		 		1
				2
				3
				4
				5
		 */
		}
		System.out.println(" ");
		for (int j = 5 ; j >= 1 ; j--) {
			System.out.println(j);
			/*output
			 	5
				4
				3
				2
				1
			 */
		}

	}

}
