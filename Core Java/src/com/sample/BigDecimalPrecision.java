package com.sample;

import java.math.BigDecimal;

public class BigDecimalPrecision {

	public static void main(String[] args) {
		double value1 = 1.05;
		double value2 = 2.05;
		double result1 = value1 + value2;
		System.out.println("value1 = " + value1);
		System.out.println("value2 = " + value2);
		System.out.println("Result1 = " + result1); //3.0999999999999996
		
		BigDecimal d1 = new BigDecimal(1.05);
		BigDecimal d2 = new BigDecimal(2.05);
		System.out.println("d1 = " + value1);
		System.out.println("d2 = " + value2);
		System.out.println("Result2 = " + d1.add(d2));  //3.0999999999999998667732370449812151491641998291015625
		
		BigDecimal d3 = new BigDecimal("1.05");
		BigDecimal d4 = new BigDecimal("2.05");
		System.out.println("d3 = " + value1);
		System.out.println("d4 = " + value2);
		System.out.println("Result2 = " + d3.add(d4));  //3.10

	}

}
