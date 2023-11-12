package com.project;

public class User {

	String userName;
	int userPassword;

	public String signIn() {
		return "Sign in  Successfully";
	}

	public String signOut() {
		return " Sign Out successfully";
	}

	public User(String userName, int userPassword) {

		this.userName = userName;
		this.userPassword = userPassword;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User obj = new User("Ahmad", 323434);

		System.out.println("UserName:"+obj.userName);
		System.out.println("UserPassword:"+obj.userPassword);
		System.out.println("Message:"+obj.signIn());
		System.out.println("Message:"+obj.signOut());

	}

}
