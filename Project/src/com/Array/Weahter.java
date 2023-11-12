package com.Array;

import java.util.Scanner;

public class Weahter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fahrenheit;
		double celsisue;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose type of weather degree to convert 1.Fahrenteit to Celsiuse");
		
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1:
			System.out.println("Enter Farenheit tempreture");
			fahrenheit = sc. nextDouble();
			celsisue = (fahrenheit - 32)*5/9;
			
			System.out.println("Celsiues tempreture is :"+celsisue);
			break;
			
		case 2:
			System.out.println("Enter Celsiuse tempreture ");
			celsisue = sc. nextDouble();
			fahrenheit = ((9*celsisue)/5) +32;
			System.out.println("Fahrenheit tempresue is: "+ fahrenheit);
			break;
			
			default :
				System.out.println("Please enter the valid value");
			
			
		
		}

	}

}
