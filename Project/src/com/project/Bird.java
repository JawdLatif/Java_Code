package com.project;

public class Bird {
	
	String name;
	String color;
	
	
	public  Bird(String name, String color) {
		this.name = name;
		this.color = color;
	
	}
	
	public String flyUp() {
		return " This bird singing nice";
	}
	
	static int sum() {
		return 2 *5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bird pageen = new Bird("Kabotar", "White");
		
		System.out.println(pageen.name);
		System.out.println(pageen.color);
		System.out.println(pageen.flyUp());
		System.out.println(pageen.sum());
		

	}

}
