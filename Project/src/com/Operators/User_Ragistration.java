package com.Operators;

public class User_Ragistration {

		String userFirstName;
		String userLastName;
		String userEmail;
		int userPhone;
		String userAddress;
		
		
		
		
	public User_Ragistration(String userFirstName, String userLastName, String userEmail, int userPhone,String userAddress) {
			super();
			this.userFirstName = userFirstName;
			this.userLastName = userLastName;
			this.userEmail = userEmail;
			this.userPhone = userPhone;
			this.userAddress = userAddress;
		}


	public String UserRagistration() {
		return "Hello World";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User_Ragistration obj = new User_Ragistration ("Ahmad", "Ahmadi", "Ahmadi@gmail.com", 943434334, "123 Downtownboard");
		
		System.out.println(obj.userFirstName);
		System.out.println(obj.userLastName);
		System.out.println(obj.userEmail);
		System.out.println(obj.userPhone);
		System.out.println(obj.userAddress);
		
		System.out.println(obj.UserRagistration());

	}

}
