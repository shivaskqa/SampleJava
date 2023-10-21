package com.hcl.sample.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchDBFromMySQLDB {

	public static void main(String[] args)throws Exception
	
	{

		String driver_Name="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://localhost:3306/mydb";
		String userName="root";
		String password="mysqlroot123";
		
		Class.forName(driver_Name);
		System.out.println("Driver class is loaded..");
		
		Connection connection=DriverManager.getConnection(dbURL,userName,password);
		System.out.println("Connection is established..");
		
		Statement statement=connection.createStatement();
		System.out.println("Statement is created..");
		
		String tableName="country";
		
		String sqlQuery=String.format("select * from %s",tableName);
		System.out.println(sqlQuery);
		
		ResultSet resultSet=statement.executeQuery(sqlQuery);
		System.out.println("Data is fetched from DB..");
		
		while(resultSet.next())
		{
			int id=resultSet.getInt("id");
			String capital_name=resultSet.getString("capital");
			String countryName=resultSet.getString("country_name");

			System.out.println(id);
			System.out.println(capital_name);
			System.out.println(countryName);
			
		}		
		
	}

}
