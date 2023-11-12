package com.practice1;

public class Manager {
	
//	Varible
	
	public String name = "Kamal";
	double salary = 123.333;
	String address ="282 Moumnet blvd";
	int DoF = 1999;
	String workDay= "Monday to Friday";
	String gender = "Female";
	
	
	
//	method
	
	public String hireNewEmplyee() {
		return "hire new employeeevery month";
	}
	
	public String helpEmployees() {
		return "Train new Employees the on thier first week";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		object
		
		Manager hrManager = new Manager();
		
		System.out.println("Name:" + hrManager.name);
		System.out.println("Salary:" + hrManager.salary);
		System.out.println("Address:"+hrManager.address);
		System.out.println("DoB:"+ hrManager.DoF);
		System.out.println(hrManager.workDay);
		System.out.println(hrManager.gender);
		
		
		System.out.println(hrManager.hireNewEmplyee());
		System.out.println(hrManager.helpEmployees());
		
		
		
		
		

	}

}
