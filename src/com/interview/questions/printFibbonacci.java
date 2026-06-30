package com.interview.questions;

public class printFibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printFibbonacciSeries(10);
		

	}

	public static void printFibbonacciSeries(int upto) {
		int a = 0;
		int b = 1;
		int sum = 2;
		int i = 1;
		while(i<upto) {
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
			
			i++;
			
		}
	}
	
}
