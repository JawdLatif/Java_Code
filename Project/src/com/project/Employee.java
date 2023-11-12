package com.project;

public class Employee {
	String name;
	int Id;

	public Employee(String name, int Id) {
		this.name = name;
		this.Id = Id;
	}

	public String callCustomer() {
		return "He is on time person";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee("Ahmad", 65657);

		System.out.println("Name:" + emp.name);
		System.out.println("Id:" + emp.Id);
		System.out.println("Message:" + emp.callCustomer());

	}

}
