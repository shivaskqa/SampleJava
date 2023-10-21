package com.hcl.sample.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ParallelArraySortingJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * List<Integer> numbers=Arrays.asList(90,84,69,49,21,54,11,99,59,100,-34,-10);
		 * 
		 * Collections.sort(numbers);
		 * 
		 * System.out.println(numbers);
		 * 
		 * Collections.sort(numbers, Collections.reverseOrder());
		 * 
		 * System.out.println(numbers);
		 */
		
		int[] numbers= {90,84,69,49,21,54,11,99,59,100,-34,-10};
		Arrays.parallelSort(numbers,0,numbers.length);
	    for(Integer i:numbers)
	    	System.out.print(i+" ");
	    String name="Konduru Shiva Shankar".substring(0, 21);
	    System.out.println(name);

	
	}

}
