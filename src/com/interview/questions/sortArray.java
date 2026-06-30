package com.interview.questions;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {19, 1222, 99, 0 ,12};
		
		//  Bubble Sort
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1; j<a.length;j++) {
				if(a[i] > a[j]) {
					int k = a[i];
					a[i] = a[j];
					a[j] = k;
				}
			}
		}
			for(int k : a) {
				System.out.println(k);
			}
	}

}
