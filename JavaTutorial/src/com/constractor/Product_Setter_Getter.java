package com.constractor;

public class Product_Setter_Getter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Getter_Setter obj = new Getter_Setter();
		obj.setProdctName("Pracetamole");
		obj.setProdctID(230);
		obj.setProductExpirationDate("09/23/2023");
		
		System.out.println(obj.getProdctName());
		System.out.println(obj.getProdctID());
		System.out.println(obj.getProductExpirationDate());
	}

}
