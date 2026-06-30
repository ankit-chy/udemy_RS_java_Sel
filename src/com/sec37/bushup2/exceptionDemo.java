package com.sec37.bushup2;

public class exceptionDemo {
	
	// code 
	// try catch mechanism

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 44;
		int b = 0 ;
		int l;
		 try {
			 System.out.println("I am in try");
				l = a/b;
				
		 } catch(ArithmeticException et) {
			 System.out.println("I am in 1st catch");
		 }
		 catch(Exception c) {
			 System.out.println("I am in 2nd catch");
		 }

	}

}
