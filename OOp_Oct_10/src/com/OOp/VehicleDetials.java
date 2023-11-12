package com.OOp;

public class VehicleDetials {
	
	public static void main(String[] args) {
		System.out.println("************Semurgh********");
		Vehicle semurgh1 = new Semurgh();
		System.out.println(semurgh1.drive());
		System.out.println(semurgh1.Usage());
		
		System.out.println("************BMW********");
		Vehicle BMW1 = new BMW();
		System.out.println(BMW1.drive());
		System.out.println(BMW1.Usage());
		
		System.out.println("************Highlander********");
		Vehicle Highlander1 = new Highlander();
		System.out.println(Highlander1.drive());
		System.out.println(Highlander1.Usage());
		
	}

}
