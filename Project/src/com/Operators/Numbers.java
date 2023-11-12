package com.Operators;

public class Numbers {
	
	public int sumNumber() {
//	local Varibles
	int num = 100;
	int num2 = 20;		
	int num3 = num -num2;
		
		return num + num2;
//		return num3;
		
//		Integer obj1 = new Integer(0);
//		int num4 = obj1.sum(400, 70);
//		return num4;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Numbers obj = new Numbers();
		
		System.out.println(obj.sumNumber());
		

	}

}
