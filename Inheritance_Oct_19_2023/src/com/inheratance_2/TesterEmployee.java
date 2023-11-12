package com.inheratance_2;

public class TesterEmployee extends EmployeeDetails {

//	inherates
	public TesterEmployee(String name, int id, double salary, String position) {
		
		super(name, id, salary, position);
	
	}
	String contacCustomers() {
		return callCustomer();
	}
}
