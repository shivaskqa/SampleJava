package com.hcl.sample.java;

import java.util.HashSet;
import java.util.Set;

public class FindMaxWordInString {

	
	private static String str="Hello1234 World908791";
	private static int a[]=new int[] {1,2,3,5,8,9,10};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		findMaxWordInString(str);
		findSmallInteger(a);
		
	}


	private static void findSmallInteger(int[] a2) {
		// TODO Auto-generated method stub
		int smallInt=1;
		Set<Integer> nums=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
			 nums.add(a[i]);
		
		System.out.println(nums);
		
		while(nums.contains(smallInt))
			smallInt++;
		
		System.out.println(smallInt);
		
	}


	private static void findMaxWordInString(String str) {
		
		str=str.replaceAll("[^a-zA-Z ]","");
        
		//Optional<String> longest=Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length));
		/*
		 * List<String> list=Arrays.asList(str.split(" ")); String
		 * biggestWord=Collections.max(list,Comparator.comparing(String::length));
		 * System.out.println(biggestWord);
		 */

		 String s[]=str.split(" ");
		 String temp="";

		 for(int i=0;i<s.length;i++)
         {
       		   if(s[i].length()>=temp.length())
        		   {
        			   temp=s[i];
        		   }
        	  }
		System.out.println(temp);
	}

}
