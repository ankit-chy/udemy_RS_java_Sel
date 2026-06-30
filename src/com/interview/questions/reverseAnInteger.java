package com.interview.questions;

public class reverseAnInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		long n = 123;
		
		// 1. Using for loop
		long revn = 0;
		
		while(n != 0) {
			revn = revn * 10 + n % 10;
			n = n / 10;
					
		}
		System.out.println(revn);
		
		
		// 2. Using String buffer
		long num = 1000111;
		System.out.println(new StringBuffer(String.valueOf(num)).reverse());
	}

}
