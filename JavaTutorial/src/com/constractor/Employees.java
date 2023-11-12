package com.constractor;

public class Employees {
	String name;
	int age;
	double salary;
	
	public Employees (String name, int age, double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	

	public static void main(String[] args) {
		
		Employees emp = new Employees("Karima",23, 333.99 );
		
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.salary);
	
	

	}

}
