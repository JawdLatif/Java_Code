package com.Polymorphasme_Oct_19_2023;

public class Calculation {

//	Polymorphasme_Method_Overloading
//	Method overloading is many methods with same name but with deffiretn order, and number parameters
	
	int sum() {
		return 2 + 2;
	}
	
	int sum(int a, int b) {
		return a - b;
	}
	
	int sum(int a, int b, int c) {
		return a += b + c;
	}
	
	public static void main(String[] args) {
		
		Calculation obj = new Calculation();
		System.out.println(obj.sum());
		System.out.println(obj.sum(50, 40));
		System.out.println(obj.sum(10,60, 30));
		

	}

}
