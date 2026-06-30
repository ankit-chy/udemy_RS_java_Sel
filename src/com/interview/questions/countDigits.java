package com.interview.questions;

public class countDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countDigits(2446));
	}
	
	public static int countDigits(int n) {
	    int count = 0;
	    int original = n;  // Store original number for divisibility checks

	    while(n != 0) {
	        int ld = n % 10;  // Get the last digit

	        if(ld != 0 && original % ld == 0) {  // Check if digit is not zero and divisible
	            count++;
	        }

	        n = n / 10;  // Remove the last digit
	    }

	    return count;
	}


}
