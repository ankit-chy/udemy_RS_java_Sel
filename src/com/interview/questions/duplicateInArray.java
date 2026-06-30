package com.interview.questions;

public class duplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] names = {"Java" ,"Ankit" , "Ankit","Something"};
		
		for(int i=0; i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				
				if(names[i].equals(names[j])) {
					System.out.println(names[j] + " is duplicated");
				}
			}
		}
		
		
	}

}
