package com.sec37.bushup2;

public class spChild extends spParent {

	String name = "String with same name of variable in child class";
	
	public spChild() {
		super(); // this should be always first line
		System.out.println("I am Child class constructor");
	}

	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public void getData() {
		super.getData();
		System.out.println("I am in child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		spChild cd = new spChild();
		cd.getStringData();
		cd.getData();

	}

}
