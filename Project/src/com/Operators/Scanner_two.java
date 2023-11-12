package com.Operators;
import java.util.Scanner;
public class Scanner_two {
	
	public void login() {
		

		String userName = "Kamal";
		String userPassword = "Kamai232";
		
		Scanner obj = new Scanner (System.in);
		
		System.out.println("Enter userName");
		String userN = obj.next();
		
		System.out.println("Enter userPassword");
		String userP = obj.next();
		
		if (userN.equals(userName) && userP.equals(userPassword) ) {
			
			System.out.println("Loged in Successfully");
			
//		} else if (!userN.equals(userName) && !userP.equals(userPassword)) {
//				System.out.println("invalid Password or UserName");	
		} else if (! userN.equals(userName) ) {
			System.out.println("Invalid UserName");
		} else if (!userP.equals(userPassword)) {
			System.out.println("invalid Password");
		} else {
			System.out.println("Credintial dose not exist");
		}
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner_two myObje = new Scanner_two();
		myObje.login();
		

	}

}
