package com.inherated_Sept_29_2023;

public class Class_C extends Class_B{

	public Class_C(String name, String address) {
		
		
		super(name, address);
		
	}

	public static void main(String[] args) {
		Class_C  obj2 = new Class_C ("Kamal", "VA");
		
		System.out.println(obj2.name);
		System.out.println(obj2.address);
		
		
		System.out.println(obj2.ShowDetiails());
		
		
	}

}
