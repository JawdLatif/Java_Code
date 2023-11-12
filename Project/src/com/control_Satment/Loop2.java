package com.control_Satment;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int n = 1; n<=33; n= n + 5) {
			System.out.println(n);
		}
		System.out.println("***************\n");
		for (int n = 1; n<=10; n++) {
			System.out.println("Weekday");
		}
		
		System.out.println("****************\n");
		
		int a = 10;
		while (a<=20){
			System.out.println(a);
			a= a +3;
		}
		
		System.out.println("***************\n");
		
		int b = 1;
		do { System.out.println("Hello World");
		 
		b= b + 2;
		
		}while (b <=20);
		
		System.out.println("****************/n");
		
		String name [] = {"Ahmad", "Karim", "Rais", "Samir", "Sanahi"};
		
		for (String n :name) {
			System.out.println(n);
		}
		System.out.println("****************/n");
		
		String list_name[]= {"Karim", "Karimi","Rais", "Mola","Rais", "Samir", "Sanahi"};
		System.out.println(list_name[3]);
		

	}

}
