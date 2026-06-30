package com.interview.questions;

public class occOfCharInStr {
	
	public static void main(String[] args) {
		countOccurences("AaaaAhssjhd" , 'A');
	}
	
	public static void countOccurences(String word, char c){
		
		int occ =0;
		char lowerC = Character.toLowerCase(c);
		for(int i=0; i<word.length();i++) {
			
			if(word.toLowerCase().charAt(i) ==  lowerC){
				occ++;			
			}
		}
		
		System.out.println(occ);
	}

}
