package com.Operators;

public class Product_G_S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prodc obj = new Prodc();
		obj.setProductName("Iphone15");
		obj.setProductID(1231);
		obj.setProductPrice(2322.99);
		obj.setProductExpirationDate("90/13/2023");
		
		System.out.println(obj.getProductName());
		System.out.println(obj.getProductID());
		System.out.println(obj.getProductPrice());
		System.out.println(obj.getProductExpirationDate());

	}

}
