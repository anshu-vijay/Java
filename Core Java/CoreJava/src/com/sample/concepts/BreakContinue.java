package com.sample.concepts;

public class BreakContinue {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			if (i == 2) {
				break;
			}
			/*output
			 1
			 2
			 */
		}
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			if (i == 2) {
				continue;
			}
			/*output
			 1
			 2
			 3
			 4
			 5			
			 */
		}
	}

}
