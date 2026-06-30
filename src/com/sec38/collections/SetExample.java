package com.sec38.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Java");
		hs.add("Set");
		hs.add("Something is good");
		System.out.println(hs);
		
		//Will not add the string second time and same as above will be printed
		hs.add("Something is good");
//		System.out.println(hs);
//		
//		System.out.println(hs.remove("Set"));
//		System.out.println(hs.isEmpty());
//		System.out.println(hs.size());
		
		//Iterator
		hs.add("Anii");
		hs.add("truemate");
		
		Iterator<String> i = hs.iterator();
		
		System.out.println(i.next());
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		

	}

}
