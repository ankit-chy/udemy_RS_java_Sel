package com.sec37.bushup2;

public class staticVariables {

	// instance variables --> These values can be changed with object to object
	// creation
	String name;
	String city;
	int age;

//	static String nationality = "Indian"; // --> Doesn't depend on object instances hence class variables All static variables are class variables
//	static int i = 0;
	
	static String nationality;
	static int i;
	static {
		nationality = "Indian";
		i = 0;
	}

	// constructor --> local variables name , city, age
	staticVariables(String name, String city, int age) {

		// storing values form local variables to instance variable using this keyword
		this.name = name;
		this.city = city;
		this.age = age;
		i++;
	}

	public void getDetails() {
		System.out.println(i + " ) " + name + " lives in " + city + ", is " + age + " years old and nationality is "
				+ nationality);
	}

	public static void  getCountry() {  // static methods will only accept static variables --> Class methods
		
		System.out.println(nationality);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staticVariables sv = new staticVariables("Ankit", "Pune", 24);
		sv.getDetails();
		staticVariables sv2 = new staticVariables("Stree", "Chanderi", 200);
		sv2.getDetails();
		
		
		getCountry();

	}

}
