package com.section36.brushup;

public class childVechile extends parentClassInhe{

	//Over riding
	//function overloading
	//either argument count should be different or
	//argument data type should be different
	public void breaks() {
		System.out.println("New Breaks");
	}
	
	public void color() {
		System.out.println(color + " is new color.");
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childVechile cv = new childVechile();
		cv.color();
		cv.breaks(); // function over riding
		cv.lights();
	
	}

}
