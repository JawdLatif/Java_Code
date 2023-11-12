package com.Operators;

import java.util.Scanner;

public class Scanner_teen {
	public void longin() {
		
		String userName = "Karim";
		String userPassword = "K1133";
		
		Scanner obj = new Scanner (System.in);
		
		System.out.println("Enter Your UserName");
		String UserN = obj.next();
		
		System.out.println("Enter Your UserPassword");
		String UserP = obj.next();
		
		if (userName.equals(UserN) && userPassword.equals(UserP)) {
		System.out.println("Log in Successfuly");
//		} else if (!userName.equals(UserN) && !userPassword.equals(UserP)) {
//			System.out.println("User Name or Password is invalid");
//		}else if (!userName.equals(UserN)) {
			System.out.println("User Name is invalid");
		}else if (!userPassword.equals(UserP)) {
			System.out.println("Password is invalid");
		}else {
			System.out.println("Credintial is not valid");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner_teen myObj = new Scanner_teen();
		
		myObj.longin();
	}

}
