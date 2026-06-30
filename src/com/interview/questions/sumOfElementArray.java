package com.interview.questions;

public class sumOfElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 8, 3, 44, 21 };
		int sum = sumArray(a);

		System.out.println(sum);

	}

	public static int sumArray(int[] a) {

		int sum = 0;

		// Iterate over array and add the element and store in sum

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		return sum;

	}

}
