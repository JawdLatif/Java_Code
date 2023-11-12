package com.inheratance_2;

public class EmployeeDetails {
//	 Varible
	String name;
	int id;
	double salary;
	String position;
	
	
//	constartor
	public EmployeeDetails(String name, int id, double salary, String position) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.position = position;
	}
	
//	Method
	
	String callCustomer() {
		
		return "Call the customer every moring";
	}
	
	public static void main(String[] args) {
		TesterEmployee obj = new TesterEmployee("Kamal", 12,121000, "Tester");
		
		System.out.println(obj.name);
		System.out.println(obj.id);
		System.out.println(obj.salary);
		System.out.println(obj.position);
		System.out.println(obj.callCustomer());
	}

}
