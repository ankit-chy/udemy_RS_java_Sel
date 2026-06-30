package com.sec38.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		
		hm.put(0, "String111");
		hm.put(2, "Snkkkskks");
		hm.put(4, "ookowkeowke");
		hm.put(5, null);
//		System.out.println("At 2nd : " + hm.get(2));
//		System.out.println("At 1st : " + hm.get(1));
//		System.out.println("At 5th : " + hm.get(5));
//		hm.remove(4);
//		System.out.println("At 4th : " + hm.get(4));
		
		Set sn = hm.entrySet();
		
		Iterator it = sn.iterator();
		
		while(it.hasNext()) {
			
		//	System.out.println("My HasMap is : " + it.next()); // giving key as well as value stored in the set
			
			// We want only value then have to do the below
			
			Map.Entry mp = (Map.Entry)it.next(); // typecasting set to map entry 
			System.out.println(mp.getKey()); // we will get key
			System.out.println(mp.getValue()); // we wil get value
		}
		
		
		
		
		
		
		 
		
		

	}

}
