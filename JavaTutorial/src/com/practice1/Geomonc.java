package com.practice1;

public class Geomonc {
	
	public String name;
	public int age;
	public double salary;
	
	
	public Geomonc(String name, int age, double salary ) {
		this.name=name;
		this.age = age;
		this.salary = salary;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Geomonc gogoruo = new Geomonc("Karim",22, 900.99);
		System.out.println(gogoruo.name);
		System.out.println(gogoruo.age);
		System.out.println(gogoruo.salary);
		

	}

}
