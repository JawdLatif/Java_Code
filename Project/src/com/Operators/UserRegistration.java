package com.Operators;

public class UserRegistration {

	String firstName;
	String lastName;
	String userName;
	String usePassword;
	String userEmail;
	String userAddrrss;
	int usercallPhone;

	public UserRegistration(String firstName, String lastName, String userName, String usePassword, String userEmail,String userAddrrss, int usercallPhone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.usePassword = usePassword;
		this.userEmail = userEmail;
		this.userAddrrss = userAddrrss;
		this.usercallPhone = usercallPhone;

	}

	public String UserRegistration() {
		return "Hello User welcome to our website";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserRegistration obj = new UserRegistration("Ahmad", "Ahmadi", "Ahmad_Ahmadi", "Qkdfkd33435", "ahmad@gmail.com", "234 Kam Apartment 90", 3453434);
		
				System.out.println(obj.firstName);
				System.out.println(obj.lastName);
				System.out.println(obj.userName);
				System.out.println(obj.usePassword);
				System.out.println(obj.userAddrrss);
				System.out.println(obj.usercallPhone);
				
				System.out.println(obj.UserRegistration());
	}

}
