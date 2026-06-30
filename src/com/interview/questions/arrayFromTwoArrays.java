package com.interview.questions;

import java.util.ArrayList;

public class arrayFromTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an array by comparing same indexes of two different arrays if they are
		// matching values

		int[] a = { 11, 2, 3, 444, 12 };
		int[] b = { 2, 2, 11, 4, 12 }; // expected new array 2,12

		ArrayList<Integer> k  =new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				k.add(a[i]);
			}
		}
//		for(int i =0; i<k.size();i++) {
//			System.out.println(k.get(i));
//		}
		
		Object[]  c = k.toArray();
		for(Object ob :c) {
			System.out.println(ob);
		}
		
	}

}
