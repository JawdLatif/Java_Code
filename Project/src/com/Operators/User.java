package com.Operators;

import java.util.Scanner;

public class User {
	public void logIn() {
		String userName = "Kamal";
		String userPassword = "K2345";

		Scanner obj = new Scanner(System.in);

		System.out.print("Enter user Name");
		String userN = obj.next();

		System.out.print("Enter Password");
		String userP = obj.next();

		if (userName.equals(userN) && userPassword.equals(userP)) {
			System.out.println("Log in Successfuly");
		} else if (!userName.equals(userN) && !userPassword.equals(userP)) {

			System.out.println("User Name or Password is invalid");
		} else if (!userName.equals(userN)) {
			System.out.println("User Name is not correct");
		} else if (!userPassword.equals(userP)) {
			System.out.println("User password is not correct");
		} else {
			System.out.println("Credintial is not correct");
		}
		
	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User myObj = new User();
		myObj.logIn();
	}

}
