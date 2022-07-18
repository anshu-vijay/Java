package com.sample;

import java.text.DecimalFormat;

public class till_2_decimal {
	private static final DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {

		double num = 12.463 - 2.663748;
		System.out.println(num);	//9.799252
		System.out.println(df.format(num));		//9.80
		System.out.println(String.format("%.02f", num));	//9.80

	}

}
