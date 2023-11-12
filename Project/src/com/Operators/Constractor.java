package com.Operators;

public class Constractor {
	
	String Name;
	String LName;
	String password;
	
	
	

	public Constractor(String name, String lName, String password) {
		
		Name = name;
		LName = lName;
		this.password = password;
	}

	public String EnterUser() {
		return "Hello User Welcome";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constractor obj = new Constractor("Amir", "Kaihan", "werkaie23r");
		
		System.out.println(obj.Name);
		System.out.println(obj.LName);
		System.out.println(obj.password);
		
		System.out.println(obj.EnterUser());

	}

}
