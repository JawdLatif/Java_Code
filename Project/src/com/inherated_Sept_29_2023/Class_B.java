package com.inherated_Sept_29_2023;

public class Class_B extends Class_A implements X{
	

	public Class_B(String name, String address) {
		super(name, address);
		
	}	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_B  obj = new Class_B ("Ahmad", "NY");
		
		System.out.println(obj.name);
		System.out.println(obj.address);
		
		
		System.out.println(obj.ShowDetiails());
		
		System.out.println(obj.village);
		System.out.println(obj.home);
		

	}

}
