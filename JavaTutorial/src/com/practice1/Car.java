package com.practice1;

public class Car {
	
	public String name="Highlander";
	public  int year = 2021;
	public String color ="red"; 
	public String made ="toyota";
	
	public String getSpeed() {
		return "run 250 miles per hour";
	}
	
	public String loading() {
		return"this car loads this merchandies with out people";
	}
	
	public String selfDrive() {
		return "this car is a self vehical";
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
//		object formula
//		class name + a name for your object + assignment oprator = +new key word + constractor() + semi columa;
//		this an object of our class
	
		Car toyota = new Car();
		System.out.println(toyota.name);
		System.out.println(toyota.year);
		System.out.println(toyota.color);
		System.out.println(toyota.made);
		
//		call method 
		System.out.println(toyota.getSpeed());
		System.out.println(toyota.selfDrive());
		System.out.println(toyota.loading());
		
	}

}
