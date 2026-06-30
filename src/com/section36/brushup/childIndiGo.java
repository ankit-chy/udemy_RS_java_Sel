package com.section36.brushup;

public class childIndiGo extends ParentAirCraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childIndiGo o = new childIndiGo();
		o.engine();
		o.safetyGuideline();
		o.bodyColor();
		

	}

	@Override 
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("White Color");
	}

}
