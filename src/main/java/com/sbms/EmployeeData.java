package com.sbms;

public class EmployeeData {
	
	private String firstName;
	private String lastName;
	private String designation;
	private double contact;
	private double salary;
	private String city;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getContact() {
		return contact;
	}
	public void setContact(double contact) {
		this.contact = contact;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "EmployeeData [firstName=" + firstName + ", lastName=" + lastName + ", designation=" + designation
				+ ", contact=" + contact + ", salary=" + salary + ", city=" + city + "]";
	}
	

}
