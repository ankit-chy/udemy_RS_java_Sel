package com.section36.brushup;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 D Array
		int[] arr = new int[5]; // Declares an array and allocates memory for the value
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " arr[" + i + "]");
		}

		int[] b = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " b[" + i + "]");
		}
		
		// Multi Dimensional Array
		
		int  mda [] [] = new int [3] [3];
		mda[0][0] = 6700;							// 67 76 77
		mda[0][1] = 76;							// 6 65 100
		mda[0][2] = 77;							// 45 54 17
		mda[1][0] = 6;
		mda[1][1] = 65;
		mda[1][2] = 100;
		mda[2][0] = 4500;
		mda[2][1] = 54;
		mda[2][2] = 17;
		
		
		for (int i = 0; i < 3; i++) {
			for(int j =0; j<2;j++) {
				System.out.println(mda[i][j]);
			}
		}
		
//		// Print smallest
//		int min = mda[0][0];
//		for (int i = 0; i < 3; i++) {
//			for(int j =0; j<2;j++) {
//				if(mda[i][j] < min) {
//					min = mda[i][j];
//				}
//			}
//		}
//		
//		System.out.println("Smallest Number is : " + min); 
//		
		
		// Print largest number from the column which has smallest number
		
		
		int min2 = mda[0][0];
		int k = 0;
		for (int i = 0; i < 3; i++) { // row
			for(int j =0; j<2;j++) { // column
				if(mda[i][j] < min2) {
					min2 = mda[i][j];
					k = j;
				}
			}
		}
		int max = mda[0][0];
		for(int i =0;i < 3 ; i++) {
			if(mda[i][k] > max) {
				max = mda[i][k];
			}
		}
		System.out.println("Max is : " + max);
	
		
	}

}
