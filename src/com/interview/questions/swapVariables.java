package com.interview.questions;

public class swapVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A. Swapping 2 integers
		int x = 10;
		int y = 67;

		// 1. Using 3rd Variable
		int t;
//		t = x;
//		x = y;
//		y = t;

		System.out.println("X : " + x + " Y : " + y);

		// 2. Without Using Third Variable and using + operation
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("X : " + x + " Y : " + y);

		// 3, Using XOR

		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("X : " + x + " Y : " + y);
//		int a = 5;  // binary: 0101
//		int b = 3;  // binary: 0011
//		int result = a ^ b;  // binary: 0110 (decimal: 6)
//		System.out.print(result);

		
		
		// B. Swapping 2 Strings
		
		String a = "Hello";
		String b = "123";
		System.out.println("Before Swapping : "  + " a is " + a + "  And b is " + b);
		
		
		
		//1. Using append
		 a = a + b;
		 b = a.substring(0, a.length() - b.length());
		 a = a.substring(b.length());
		 System.out.println("After Swapping : "  + " a is " + a + "  And b is " + b);
		 
		 String s1 = "AbC is DeF";
		 String rev = "";
		 
		 for(int i=s1.length()-1; i>=0;i--) {
			 rev = rev + s1.charAt(i);
		 }
		
		 System.out.println(rev);
	}

}
