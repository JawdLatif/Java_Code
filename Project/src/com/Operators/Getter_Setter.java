package com.Operators;

public class Getter_Setter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product_getter_setter obj = new Product_getter_setter();
		
		obj.setProductName("Iphone");
		obj.setProductID(111);
		obj.setProductprice(200.99);
		obj.setProductExpirationDate("9/23/2024");
		
		System.out.println(obj.getProductName());
		System.out.println(obj.getProductID());
		System.out.println(obj.getProductprice());
		System.out.println(obj.getProductExpirationDate());
		

	}

}
