package com.sec38.collections;
import java.util.ArrayList;

public class ArrayListsssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2666);
		a.add(9199);
		System.out.println("before : "  + a);
		
		a.add(0, 1111);
		System.out.println("after : " + a);
	
//		a.remove(2);
//		a.remove(2666);
//		System.out.println("after  remove index : " + a);
		
		System.out.println("a.get(0) : " +a.get(0));
		
		// to check whether something is present or not 
		System.out.println("Contains : " + a.contains(1111));
		
		System.out.println("Index of 2666 : " + a.indexOf(2666));
		System.out.println("is empty : " + a.isEmpty());
		System.out.println("Size is : " + a.size());

	}

}


