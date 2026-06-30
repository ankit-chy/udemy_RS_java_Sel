package com.section36.brushup;

public class coreJava_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Normal do while loop
//		int i =1;
//		do{
//			System.out.println("Jokk");
//			i++;
//		}
//		while(i<10);{
//			System.out.println(i);
//			
//		}
//	

		// Nested Loops

//		for(int i = 1 ; i<=4;i++) // Outer loops this block will loop 4 times
//		{
//			
//			for(int j =1; j<=4;j++) 
//			{
//				
//			}
//		}

		// Q1) Printing the following pattern
		// 1 2 3 4
		// 5 6 7
		// 8 9
		// 10

		int count = 1;
		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4 - i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}

		// Q2) Printing the following pattern
		// 1
		// 2 3
		// 4 5 6
		// 7 8 9 10
		System.out.println("***********      ***********");
		int count2 = 1;
		for (int i = 0; i < 4; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(count2 + " ");
				count2++;
			}
			System.out.println();
		}

		// Q3) Printing the following pattern
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4

		System.out.println("***********      ***********");
		for (int i = 0; i < 4; i++) {
			int count3 = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(count3 + " ");
				count3++;
			}
			System.out.println();
		}
		
		// Q4) Printing the following pattern
				// 3
				// 6 9
				// 12 15 18
				// 21 24 27 30
		System.out.println("***********      ***********");
		int k = 1;
		for (int i = 1; i < 5; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print( 3 * k + " ");
				k++;
				
			}
			System.out.println();
		}
		


	}

}
