package com.interview.questions;

public class diffBwSumAndProd {
	
	public static void diffBwSumAndProdDigits(int n){
		
		int sum = 0;
		int prod = 1;
		int ld = 0;
		
		while(n > 0) {
			ld = n % 10;
			n = n  / 10;
			
			sum = sum + ld;
			prod = prod * ld;
		}
		
		System.out.println("Products of digits : " + prod);
		System.out.println("Sum of digits : " + sum);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		diffBwSumAndProdDigits(234);		
	}
	
}
