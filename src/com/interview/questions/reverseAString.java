package com.interview.questions;

public class reverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Reverse a String
		
		String s = " I love India";
		
		//s.reverse() --> No any reversible function in String class string is immutable
		// 1. Using for loop
		String revS = "";
		for(int i = s.length() - 1 ; i >= 0; i--) {
			revS =  revS + s.charAt(i);
		}
		
		System.out.println(revS);
		
		
		// 2. Using String Buffer
		
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
		
		
		// Input: s = “i love programming very much” 
		// Output: s = “much very programming love i” 
		
		String s2 = "i love programming very much";
		String[] words = s2.split(" ");
		
		String revS2 = "";
		
		for(int i=words.length-1; i>=0; i--) {
			revS2 = revS2 + words[i];
		}
		
		 revS2 = revS2.trim();
		System.out.println(revS2);

	}

}
