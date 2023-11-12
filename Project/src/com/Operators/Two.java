package com.Operators;

import java.util.Scanner;

public class Two {

	public void login() {
		String userName = "Karim";
		String userPassword = "kam3344";

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter UserName");
		String userN = obj.next();

		System.out.println("Enter UserPassword");
		String userP = obj.next();

		if (userN.equals(userName) && userP.equals(userPassword)) {

			System.out.println("Long In Successfuly!");

		} else if (!userN.equals(userName) && !userP.equals(userPassword)) {
			System.out.println("Ivalid UserName or Password");
		} else if (!userN.equals(userName)) {
			System.out.println("User Name is invalid");
		} else if (!userP.equals(userPassword)) {
			System.out.println("Password is invalid");

		} else {
			System.out.println("Credintial dose not exist");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Two myObj = new Two();
		myObj.login();
	}

}
