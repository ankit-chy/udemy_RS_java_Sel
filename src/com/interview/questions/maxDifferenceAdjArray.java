package com.interview.questions;

public class maxDifferenceAdjArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = { 1,4,61,9,100}; // 3, 57,-52, 91
		
		int diff = 0;
		
		for(int i =0; i<a.length-1;i++) {
			if(a[i+1] - a  [i] > diff) {
				diff = a[i+1] - a  [i];
			}
		}
		System.out.println(diff);

	}

}
