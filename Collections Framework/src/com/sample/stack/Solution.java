package com.sample.stack;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Stack<Integer> stackObj =new Stack<Integer>();
		stackObj.push(20);
		stackObj.push(50);
		stackObj.push(70);
		stackObj.push(30);
		System.out.println(stackObj);  	//[20, 50, 70, 30]
		stackObj.pop();		
		System.out.println(stackObj); 	//[20, 50, 70]
		stackObj.push(90);
		System.out.println(stackObj); 	//[20, 50, 70, 90]
		
		System.out.println("peek: " + stackObj.peek()); 	//peek: 90
		
	}

}
