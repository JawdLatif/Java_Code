package com.project;

public class Mobile {

	String name;
	double price;

	public String call() {
		return "iPhone device has the best security";
	}

	public Mobile(String name, double price) {

		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile iPhone = new Mobile("Iphone 14", 1400.00);
		System.out.println(iPhone.name);
		System.out.println(iPhone.price);
		System.out.println(iPhone.call());

	}

}
