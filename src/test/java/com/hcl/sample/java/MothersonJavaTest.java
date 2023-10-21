package com.hcl.sample.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MothersonJavaTest {
	
	public static void main(String[] args) {
		
		//1 10 20 30 40 30 60 30 20
		
		
		
		int numbers[]=new int[] {1 ,10 ,20 ,30, 40, 30, 60, 30, 20};
		
		int temp,min,max;
		
		//Find Min and Max via Stream API
        int maxnumber=Arrays.stream(numbers).reduce((e1,e2)->e1>e2?e1:e2).getAsInt();
        System.out.println("With Java Stream API and boxed technique.. "+maxnumber);      		
		
		int minNumber=Arrays.stream(numbers).reduce((e1,e2)->e1<e2?e1:e2).getAsInt();
		System.out.println("With Java stream API and boxed technique.. "+minNumber);
		
		Arrays.stream(numbers)
		   .boxed()
		   .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		   .entrySet()
		   .stream()
		   .filter(e->e.getValue()>1)
		   .forEach(System.out::println);
           
		Arrays.stream(numbers)
		   .boxed()
		   .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		   .entrySet()
		   .stream()
		   .filter(e->e.getValue()==1)
		   .forEach(System.out::println);
     

		temp=numbers[0];
		for(int i=0;i<numbers.length;i++)
		{
			if(temp>numbers[i])
				temp=numbers[i];
		}
		
		min=temp;
		System.out.println("Minimum Number from the array list.."+min);
		
		temp=numbers[0];
		for(int i=0;i<numbers.length;i++)
		{
			if(temp<numbers[i])
				temp=numbers[i];
		}
		max=temp;
		System.out.println("Maximum number from the array list.."+max);
		
		
		
		
		
		String input="My name is Arpit";
		//Ar piti sn ameMy
		
		String[] strs=input.split(" ");
		String resString="";
		
		for(int i=strs.length-1;i>=0;i--)
		  resString=resString+strs[i];
		//ArpitisnameMy	
		
		System.out.println(resString.substring(0,2)+" "+resString.substring(2,6)+" "+resString.substring(6,8)+" "+resString.substring(8));
	}

}
