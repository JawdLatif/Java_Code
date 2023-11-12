package com.control_Satment;

public class Loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int num = 20; num>=10; num --) {
			System.out.println(num);
		}
		
		System.out.println("********************\n");
		
		String name[]= {"Karim", "Jahn", "Bob", "Ahmad"};
		
		for (String n: name) {
			System.out.println(n);
		}
		
		int c = 0;
		while (c<5) {
			c++;
			System.out.println(c);
		}
		
		System.out.println("********************\n");
		
		int g =1;
		do {
			g++;
			System.out.println(g);
		} while(g<=5);

	}

}
