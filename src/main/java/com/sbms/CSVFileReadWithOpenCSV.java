package com.sbms;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.opencsv.CSVReader;

public class CSVFileReadWithOpenCSV {

	public static void main(String[] args)throws Exception 
	{

		List<EmployeeData> employeesList=new ArrayList<EmployeeData>();
		
		List<List<String>> rows=getRecordsFromCSVFile();
		
		for(List<String> temp:rows)
		{
			EmployeeData obj=new EmployeeData();
			
				String fname=temp.get(0);
			     String lname=temp.get(1);
			     String designation=temp.get(2);
			     double contact=Double.parseDouble(temp.get(3));
			     double salary=Double.parseDouble(temp.get(4));
			     String city=temp.get(5);
			     
			     obj.setFirstName(fname);
			     obj.setLastName(lname);
			     obj.setDesignation(designation);
			     obj.setContact(contact);
			     obj.setCity(city);
			     obj.setSalary(salary);
			     
			     employeesList.add(obj);
			     
		 }
		
		for(EmployeeData e:employeesList)
			System.out.println(e);
		
		
		//Code snippet for converting list of employee objects to json via ObjectMapper
		  ObjectMapper obj=new ObjectMapper(); 
		  String jsonPayload=obj.writeValueAsString(employeesList);
		  System.out.println(jsonPayload);
		 
		//Code snippet for converting list of employee objects to json payload via Gson
        Gson gson=new Gson();
        String jsonpayload=gson.toJson(employeesList);
		System.out.println(jsonpayload);
		
        JSONArray array=new JSONArray(jsonpayload);
        
        Iterator<Object> iterator=array.iterator();
        
        while(iterator.hasNext())
        {
          JSONObject jsonObject=(JSONObject)iterator.next();
          System.out.println(jsonObject.get("firstName"));
          System.out.println(jsonObject.get("lastName"));
          System.out.println(jsonObject.get("designation"));
          System.out.println(jsonObject.get("contact"));
          System.out.println(jsonObject.get("salary"));
          System.out.println(jsonObject.get("city"));
          
        }
        
        
	}
	
	public static List<List<String>> getRecordsFromCSVFile()throws Exception
	{
		String csvFilePath=System.getProperty("user.dir")+"\\src\\main\\resources\\EmployeeData.csv";
		
		CSVReader reader=new CSVReader(new FileReader(csvFilePath));
		
		String[] line;
		
		List<List<String>> records=new ArrayList<List<String>>();
		
		while((line=reader.readNext())!=null)
		{
			records.add(Arrays.asList(line));
		}

		return records;
	}
	
}
