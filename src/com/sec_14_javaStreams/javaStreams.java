package com.sec_14_javaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class javaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. Count the number of names starting with alphabet A in list
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Ankit");
		name.add("Anky");
		name.add("Aryamn");
		name.add("Sheetal");
		name.add("Don");
		int count=0;
		
		// A. Conventional Method of coding
		for(int i=0; i<name.size();i++) {
			String actual = name.get(i);
			if(actual.startsWith("A")) {
				count++ ;
			}
		}
		System.out.println("There are " + count + " names which starts with A.");
		
		
		//B. Using Streams API
		// There  is no life for intermediate op if there is no terminal op
		// terminal op will execute only if intermediate op(Filter in this case) returns true
		// we can create stream
		long c  =name.stream().filter(s->s.startsWith("A")).count();		
		System.out.println("There are " + c + " names which starts with A using API");
		
		
		long d = Stream.of("Ankit","Ani","Akey","KSjdkjs").filter(s-> 
		{
			s.startsWith("k");
			return true;  // if we return false  then the terminal op that is count will not be executed hence d will be 0 only, 
						   // also if we remove return statement then have to remove curly braces as well 
			
		}).count();
		
		System.out.println("D is : " + d);
		
		// 2.Print all values of the list which is greater than length 4
		
		//name.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		//name.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));  // -->  Will limit to only first result hence only Ankit will be printed
		//streamMap();
		streamCollect();
	}
	
	public static void streamMap() {
		
		//3. Print names which end with t and convert in Upper case
		//Stream.of("Ankit","Anit","Akey","KSjdkjs").filter(s->s.endsWith("t")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//4. Print names which starts with a and convert in Upper case and sorted
		Stream.of("Ankit","Anit","Akey","KSjdkjs").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		
		
	}

	public static void streamCollect() {
		
		List<String> ls =Stream.of("Ankit","Anit","Akey","KSjdkjs").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());

		System.out.println(ls.get(0));
		
		
		
	}
}
