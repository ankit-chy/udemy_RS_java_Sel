package com.section3.brushup;
import com.sec37.bushup2.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class coreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum = 5;
		String str = "Something is good";
		char ch = 'g';
		boolean myCard = true;

		System.out.println("My vars are : " + myNum + str + ch + myCard);

		// Integers Arrays
		int[] myArr1 = new int[5];
		myArr1[0] = 000;
		myArr1[1] = 111;
		myArr1[2] = 222;
		myArr1[3] = 333;
		myArr1[4] = 444;

		int[] myArr2 = { 1, 22, 333, 4444 };

		// for accessing array elements
		for (int i = 0; i < myArr1.length; i++) {
			System.out.println("for array " + i + " value is : " + myArr1[i]);
		}

		// String Array
		String[] name = { "Ankit", "Bot , ", "hai..!!}" };
		for (int i = 0; i < name.length; i++) {
			System.out.println("Name is : " + name[i]);
		}

		// Enhanced For loop just like for each one s variable is created
		for (String s : name) {
			System.out.println("Str : " + s);
		}

		// if else conditions

		int[] newArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 19, 10, 2888 };

		// get even numbers only from array

		for (int i = 0; i < newArr.length; i++) {
			if (newArr[i] % 2 == 0) {
				System.out.println(newArr[i]);
			}
		}

		// ArrayLists

		// creating object of the class
		ArrayList<String> a = new ArrayList<String>();

		// adding & removing values in arraylist
		a.add("Ankitttt");
		a.add("Adding second value");
		a.add("Added to removed");
		a.add("3rd Element");
		a.add("Something something");

		a.remove(2);

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		System.out.println("*****************");

		// enhanced for loop
		for (String val : a) {
			System.out.println("Value is : " + val);
		}

		// Converting array to arrayList

		String[] myName = { "First Name", "Second Name", "Third Name", "Fourth Name" };

		List<String> nameArrayList = Arrays.asList(myName);

		System.out.println("Does myName contains Second Name : " + nameArrayList.contains("Second Name"));

		// Strings
		String s = "My Name is Ankit";
		String s1 = "My Name";

		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		String[] splittedSting = s.split(" ");
		System.out.println(splittedSting[0]);
		System.out.println(splittedSting[1].trim());

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		// Reverse a String
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

		coreJavaBrushup1 c = new coreJavaBrushup1();
		c.getData();
		getData2();
		
		// Crated objeect of other class and feteched methods
		MethodDemo2 d = new MethodDemo2();
		d.getUserData();
	}

	public void getData() {
		System.out.println("SSSSSS");
	}
	public static void getData2() {
		System.out.println("Used static keyword in decaration of method hence no need of creating object of the same class");
	}
}
