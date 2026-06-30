package com.sec37.bushup2;

public class acessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// Default : access method anywhere in package
	void defaultss() {
		// this method can only be accessed in same package.
		System.out.println("I am default");

	}
	
	// public : Variable/Method can be accessed in any package.
	
	public void abc() {
		System.out.println("I am public");
	}
	
	//private :  Variable/Method cannot be accessed outside of the same class.
	private void prv() {
		System.out.println("I am private");
	}
	
	//protected : variables/method can be accessed in sub class only to other packages
	protected void prc() {
		System.out.println("I am protected");
	}

}
