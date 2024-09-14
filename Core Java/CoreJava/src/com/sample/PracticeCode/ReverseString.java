package com.sample.PracticeCode;

public class ReverseString {

	public static void main(String[] args) {
		String s = "hello world";
		
		//Method 1
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		
		//Method 2
		StringBuilder stringBuildervarible = new StringBuilder();
		System.out.println(stringBuildervarible.append(s).reverse());

	}

}
