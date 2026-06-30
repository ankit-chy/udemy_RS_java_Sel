package com.interview.questions;

public class multiplicationTable {

	// Print 5 multiplication table without using Multiply operator

	public static void main(String[] args) {
		int result = multiply(5, 10000);
		System.out.println(result);

	}

	public static int multiply(int i, int j) {

		// i has to sum itself j times
		int k = 1;
		int sum = 0;

		while (k <= j) {

			sum = sum + i;
			k++;
		}

		return sum;
	}

}
