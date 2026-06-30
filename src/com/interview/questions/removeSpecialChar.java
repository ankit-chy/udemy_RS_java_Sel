package com.interview.questions;

public class removeSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = " $$$%^^&&&^ I love Myself ***((^%%";
		
		//Regular Expression
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.print(s);
		
	}

}
