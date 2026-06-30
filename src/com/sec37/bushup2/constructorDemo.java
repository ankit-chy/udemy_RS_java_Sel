package com.sec37.bushup2;

public class constructorDemo {
	
	public constructorDemo(){
		System.out.println("I am consructor");
		
	}
	
	//Parameterized Constructor
	public constructorDemo(int a){
		System.out.println("I am in Parameterized consructor");
		
	}

	
	public void getData() {
		System.out.println("I am a method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructorDemo cd = new constructorDemo();
		//whenever we create an object of class constructor is called
		constructorDemo cd2 = new constructorDemo(2);
		
		
		// Super Keyword
		
		

	}

}
