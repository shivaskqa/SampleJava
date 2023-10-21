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

public class CSVFileReaderJava {

	private static final String csvfilepath = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\EmployeeData.csv";

	public static void main(String[] args) throws Exception {

		List<List<String>> rows = getDataFromCSVFile(csvfilepath);

		List<EmployeeData> listofEmployees=new ArrayList<EmployeeData>();
		
		
		for(List<String> temp:rows)
		{
			EmployeeData obj=new EmployeeData();
			
			obj.setFirstName(temp.get(0));
			obj.setLastName(temp.get(1));
			obj.setDesignation(temp.get(2));
			obj.setContact(Double.parseDouble(temp.get(3)));
			obj.setSalary(Double.parseDouble(temp.get(4)));
			obj.setCity(temp.get(5));
			
			listofEmployees.add(obj);
		}
		
		ObjectMapper objectMapper=new ObjectMapper();
		String jsonPayload=objectMapper.writeValueAsString(listofEmployees);
		System.out.println(jsonPayload); 
		
		Gson gson=new Gson();
		String gsonPayload=gson.toJson(jsonPayload);
		System.out.println(gsonPayload);
		
		JSONArray array=new JSONArray(jsonPayload);
		
		Iterator<Object> iterator=array.iterator();
		
		while(iterator.hasNext())
		{
			JSONObject jsonObject=(JSONObject)iterator.next();
			
			jsonObject.get("firstName");
			jsonObject.get("lastName");
			jsonObject.get("designation");
			jsonObject.get("contact");
			jsonObject.get("salary");
			jsonObject.get("city");

			System.out.println(jsonObject.get("firstName")+","+jsonObject.get("lastName")+","+jsonObject.get("designation")+","
			                   +jsonObject.get("contact")+","+jsonObject.get("salary")+","+jsonObject.get("city"));
			
		}
		
	}

	public static List<List<String>> getDataFromCSVFile(String filePath) {

		List<List<String>> records = new ArrayList<List<String>>();

		try {

			CSVReader reader = new CSVReader(new FileReader(filePath));
			String[] line;

			while ((line = reader.readNext()) != null) {
				records.add(Arrays.asList(line));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return records;
	}

}
