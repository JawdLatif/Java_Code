package com.Array;

public class SingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aptNumber[]= new int[4];
		
		aptNumber[0] = 25;
		aptNumber[1] = 26;
		aptNumber[2] = 27;
		aptNumber[3] = 28;
		
		
//		System.out.println(aptNumber[2]);
		
		for (int a=0; a<aptNumber.length      ; a++) {
			System.out.println(aptNumber[a]);
		}
		
		
		int shopNumbers[]= {1,3,4,5,6,7,8,9};
		for (int s : shopNumbers) {
			System.out.println(s);
		}
	}

}
