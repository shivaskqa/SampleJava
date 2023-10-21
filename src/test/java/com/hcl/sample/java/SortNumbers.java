package com.hcl.sample.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(10,25,56,67,89,90,98,43,32,21,23,49,90);
		
		int maxOne=numbers.stream().sorted().collect(Collectors.toList()).get(0);
		int maxTwo=numbers.stream().sorted().collect(Collectors.toList()).get(1);
		
		System.out.println(maxOne);
		System.out.println(maxTwo);
		
		numbers=numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Descending Order of numbers..");
		System.out.println(numbers);
		
		String sentence="Welcome to Sea of Java Programming as you need to Swim for sure";
		
		sentence=sentence.toLowerCase();
		String s[]=sentence.split(" ");
		
		System.out.println("Words are arranged in ascending (sorted) order....");
		System.out.println(Arrays.stream(s).sorted().collect(Collectors.toList()));
		
		System.out.println("Words are arranged in descending order..");
		System.out.println(Arrays.stream(s).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		
		List<String> words=Arrays.asList(s);
		
		Collections.sort(words);
		System.out.println(words);
		
		Collections.sort(words,Collections.reverseOrder());
		System.out.println(words);
		
		String name="welcome";
		String reverseName="";
		
		for(int i=name.length()-1;i>=0;i--)
			 reverseName=reverseName+name.charAt(i);
		System.out.println(reverseName);
	}

}
