package com.control_Satment;

public class Nest_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int carPrice = 5000;
		String carName = "BMW";
		
		if (carPrice== 50000 && carName =="BMW") {
			System.out.println("I will Buy the car with price 50000 and the name should be BMW");
			if (carPrice>10000) {
				System.out.println("The price should be over 10000.");
			}
		} 

	}

}
