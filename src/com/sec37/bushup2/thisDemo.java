package com.sec37.bushup2;

public class thisDemo {

	int a = 100;
	
	public void getData() {
		int a = 3;
		System.out.println(a);
		System.out.println("Using this keyword : " + this.a); // this refer to current object - object scopes lies in class level hence 100 will be printed
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisDemo td = new thisDemo();
		td.getData();

	}

}
