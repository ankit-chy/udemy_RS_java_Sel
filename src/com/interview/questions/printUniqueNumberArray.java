package com.interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class printUniqueNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Print unique numbers from the array 
		List<Integer> ls = Arrays.asList(3,2,177,18,2,3,3,18);
		
		//ls.stream().distinct().forEach(s->System.out.println(s));
		
		//Sort it and give only 3rd index i.e; 18
		List<Integer> newLs =ls.stream().distinct().sorted().collect(Collectors.toList());
		System.out.print(newLs.get(2));

	}

}
