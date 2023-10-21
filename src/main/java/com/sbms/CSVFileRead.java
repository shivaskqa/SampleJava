package com.sbms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVFileRead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	String csvFilePath="C:\\Users\\Shiva\\Desktop\\EmployeeData.csv";	
	Scanner scanner=new Scanner(new File(csvFilePath));
	scanner.useDelimiter(",");
	
	while(scanner.hasNext())
	{
		String line=scanner.next();
		System.out.print(line+",");
	}
		scanner.close();
		
	}

}
