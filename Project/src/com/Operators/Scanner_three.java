package com.Operators;

import java.util.Scanner;
public class Scanner_three {
	
	public void longin() {
		
		String uesN = "Kamal";
		String useP = "1242kak";
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter user Name");
		String userName = obj.next();
		
		System.out.println("Enter User Password");
		String userPassword = obj.next();
		
		if (userName.equals(uesN) && userPassword.equals(useP) ) {
			System.out.println("Loged in Successfully");
			
		} else if (!userName.equals(uesN) && !userPassword.equals(useP)) {
			System.out.println("UserName or Password is incorrect");
		} else if (!userName.equals(uesN)) {
			System.out.println("Invalid UserName");
				
		}else if (!userPassword.equals(useP)) {
			System.out.println("Invalid userPassword");
		}  else { 
			System.out.println("Credintial is not exist");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner_three myObj = new Scanner_three();
		myObj.longin();

	}

}
