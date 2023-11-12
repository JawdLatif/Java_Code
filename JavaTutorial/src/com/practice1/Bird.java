package com.practice1;

public class Bird {
	
//	we plan to initialize our variable through constractor
		String name;
	int age;
	String color;
	String livingArea;
	
//	access modifir + name of our class + pranthisis + curly braces
//	we have three type of constractor
//	1. dafult constractor
//	2.no argument constractor
//	3. parametrized constractor
	
//	dafult constractor
//	public Bird() {};
	
//	2.no argument constractor
//	public Bird() {};
//	any parameters inside these paranthise called argument
	
//	3. parametrized constractor
	public Bird(String name, int age, String color, String livingArea) {
		this.name = name; 
		this.age = age; 
		this.color = color; 
		this.livingArea = livingArea; 
		
	};
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bird Eagle = new Bird("Blad Eagle", 15, "Gray", "USA");
		System.out.println(Eagle.name); 
		System.out.println(Eagle.age); 
		System.out.println(Eagle.color); 
		System.out.println(Eagle.livingArea); 
	}

}
